package lis.services;

import lis.base.CrudService;
import lis.exceptions.NotFoundException;
import lis.models.MedicalRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MedicalRecordService extends CrudService<Integer> {
    List<MedicalRecord> getAllByPatientId(Integer id);
    MedicalRecord validate(Integer id) throws NotFoundException;
    List<MedicalRecord> getAllInvalidRecords();
    <T> Page<T> findAll(Pageable page, Class<T> resultDtoClass);
}
