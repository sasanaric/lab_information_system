package lis.services;

import lis.base.CrudService;
import lis.models.MedicalRecord;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MedicalRecordService extends CrudService<Integer> {
    List<MedicalRecord> getAllByPatientId(Integer id);
}
