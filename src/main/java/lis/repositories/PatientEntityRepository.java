package lis.repositories;

import lis.models.MedicalRecord;
import lis.models.entities.PatientEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PatientEntityRepository extends JpaRepository<PatientEntity,Integer> {

}
