package lis.models.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;
@Data
@Entity
@Table(name = "medical_record")
public class MedicalRecordEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "icd", nullable = false, length = 20)
    private String icd;
    @Basic
    @Column(name = "hematology_id", nullable = true)
    private Integer hematologyId;
    @Basic
    @Column(name = "urine_id", nullable = true)
    private Integer urineId;
    @Basic
    @Column(name = "biochemistry_id", nullable = true)
    private Integer biochemistryId;
    @Basic
    @Column(name = "patient_id", nullable = false)
    private Integer patientId;
    @Basic
    @Column(name = "user_id", nullable = false)
    private Integer userId;
    @Basic
    @Column(name = "is_valid", nullable = true)
    private Byte isValid;
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
