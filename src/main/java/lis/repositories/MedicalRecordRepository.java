package lis.repositories;

import lis.models.MedicalRecord;
import lis.models.entities.MedicalRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalRecordRepository extends JpaRepository<MedicalRecordEntity, Integer> {
}
