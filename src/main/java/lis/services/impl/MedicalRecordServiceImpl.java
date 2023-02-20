package lis.services.impl;

import lis.base.CrudJpaService;
import lis.exceptions.NotFoundException;
import lis.models.MedicalRecord;
import lis.models.User;
import lis.models.entities.MedicalRecordEntity;
import lis.repositories.MedicalRecordRepository;
import lis.services.MedicalRecordService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MedicalRecordServiceImpl extends CrudJpaService<MedicalRecordEntity, Integer> implements MedicalRecordService {
    private final MedicalRecordRepository repository;
    private final ModelMapper modelMapper;

    public MedicalRecordServiceImpl(MedicalRecordRepository repository, ModelMapper modelMapper) {
        super(repository, modelMapper, MedicalRecordEntity.class);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<MedicalRecord> getAll(){
        return super.findAll(MedicalRecord.class).stream().sorted(new Comparator<MedicalRecord>() {
            @Override
            public int compare(MedicalRecord o1, MedicalRecord o2) {
                return o2.getCreatedTime().compareTo(o1.getCreatedTime());
            }
        }).collect(Collectors.toList());
    }

    @Override
    public Page<MedicalRecord> getAllFilteredByTime(Pageable page, String createdTime) {
        LocalDate date = LocalDate.parse(createdTime);
        System.out.println(createdTime);

        List<MedicalRecord> filteredByTime = repository
                .findAll()
                .stream()
                .filter(x -> x.getCreatedTime().toLocalDateTime().toLocalDate().equals(date))
                .map(m -> modelMapper.map(m, MedicalRecord.class))
                .collect(Collectors.toList());
        int pageSize = page.getPageSize();
        int start = page.getPageNumber() * pageSize;
        int end = Math.min((page.getPageNumber() + 1) * pageSize, filteredByTime.size());


        return new PageImpl<>(filteredByTime.subList(start, end), page, filteredByTime.size());
    }

    @Override
    public Page<MedicalRecord> getAllInvalidPaginated(Pageable page){
        long totalElements = repository.findAll()
                .stream()
                .filter(x -> x.getIsValid().equals("false"))
                .count();
        List<MedicalRecord> filteredRecords = repository
                .findByIsValid("false", page)
                .stream()
                .map(m -> modelMapper.map(m, MedicalRecord.class))
                .collect(Collectors.toList());
        return new PageImpl<>(filteredRecords, page, totalElements);
    }

    @Override
    public List<MedicalRecord> getAllInvalidRecords(){
        return repository
                .findAll()
                .stream()
                .filter(x -> !x.getIsValid().equals("true"))
                .sorted(new Comparator<MedicalRecordEntity>() {
                    @Override
                    public int compare(MedicalRecordEntity o1, MedicalRecordEntity o2) {
                        return o2.getCreatedTime().compareTo(o1.getCreatedTime());
                    }
                })
                .map(m -> modelMapper.map(m, MedicalRecord.class))
                .collect(Collectors.toList());
    }

    public MedicalRecord validate(Integer id) throws NotFoundException {
        MedicalRecord record = modelMapper.map(repository.findById(id), MedicalRecord.class);
        record.setIsValid("true");
        return super.update(id, record, MedicalRecord.class);
    }

    @Override
    public List<MedicalRecord> getAllByPatientId(Integer id) {
        return repository.getAllByPatientId(id).stream().map(m -> modelMapper.map(m, MedicalRecord.class)).collect(Collectors.toList());
    }
}
