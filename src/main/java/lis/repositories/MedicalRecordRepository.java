package lis.repositories;

import lis.models.MedicalRecord;
import lis.models.entities.MedicalRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicalRecordRepository extends JpaRepository<MedicalRecordEntity, Integer> {
    List<MedicalRecordEntity> getAllByPatientId(Integer patientId);
}
