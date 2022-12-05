package lis.repositories;

import lis.models.entities.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientEntityRepository extends JpaRepository<PatientEntity,Integer> {
}
