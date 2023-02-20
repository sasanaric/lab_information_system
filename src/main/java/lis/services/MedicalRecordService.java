package lis.services;

import lis.base.CrudService;
import lis.exceptions.NotFoundException;
import lis.models.MedicalRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableArgumentResolver;

import java.util.List;

public interface MedicalRecordService extends CrudService<Integer> {
    List<MedicalRecord> getAllByPatientId(Integer id);
    MedicalRecord validate(Integer id) throws NotFoundException;
    List<MedicalRecord> getAllInvalidRecords();
    Page<MedicalRecord> getAllInvalidPaginated(Pageable page);
    List<MedicalRecord> getAll();
    Page<MedicalRecord> getAllFilteredByTime(Pageable page, String createdTime);
    <T> Page<T> findAll(Pageable page, Class<T> resultDtoClass);
}
