package lis.services.impl;

import lis.base.CrudJpaService;
import lis.exceptions.NotFoundException;
import lis.models.MedicalRecord;
import lis.models.User;
import lis.models.entities.MedicalRecordEntity;
import lis.repositories.MedicalRecordRepository;
import lis.services.MedicalRecordService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

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
    public List<MedicalRecord> getAllInvalidRecords(){
        return repository
                .findAll()
                .stream()
                .filter(x -> !x.getIsValid().equals("true"))
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
