package lis.models.entities;

import jakarta.persistence.*;
import lis.base.BaseEntity;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Objects;
@Data
@Entity
@Table(name = "medical_record")
@EntityListeners(AuditingEntityListener.class)

public class MedicalRecordEntity implements BaseEntity<Integer> {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "icd", nullable = false, length = 20)
    private String icd;
    @Basic
    @Column(name = "is_valid", nullable = true)
    private String isValid;
    @OneToOne
    @JoinColumn(name = "hematology_id", referencedColumnName = "id")
    private HematologyEntity hematology;
    @OneToOne
    @JoinColumn(name = "urine_id", referencedColumnName = "id")
    private UrineEntity urine;
    @OneToOne
    @JoinColumn(name = "biochemistry_id", referencedColumnName = "id")
    private BiochemistryEntity biochemistry;
    @ManyToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id", nullable = false)
    private PatientEntity patient;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private UserEntity user;
}
