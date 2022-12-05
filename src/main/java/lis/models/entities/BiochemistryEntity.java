package lis.models.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;
@Data
@Entity
@Table(name = "biochemistry")
public class BiochemistryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "s-glucose", nullable = false, precision = 0)
    private Integer sGlucose;
    @Basic
    @Column(name = "s-urea", nullable = false, precision = 0)
    private Integer sUrea;
    @Basic
    @Column(name = "s-creatinine", nullable = false)
    private Integer sCreatinine;
    @OneToOne(mappedBy = "biochemistry")
    private MedicalRecordEntity medicalRecord;
}
