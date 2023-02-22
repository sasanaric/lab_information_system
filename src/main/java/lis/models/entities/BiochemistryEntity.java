package lis.models.entities;

import jakarta.persistence.*;
import lis.base.BaseEntity;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Objects;
@Data
@Entity
@Table(name = "biochemistry")
@EntityListeners(AuditingEntityListener.class)

public class BiochemistryEntity implements BaseEntity<Integer> {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "s_glucose", nullable = false, precision = 0)
    private Double sGlucose;
    @Basic
    @Column(name = "s_urea", nullable = false, precision = 0)
    private Double sUrea;
    @Basic
    @Column(name = "s_creatinine", nullable = false)
    private Integer sCreatinine;
    @OneToOne(mappedBy = "biochemistry")
    private MedicalRecordEntity medicalRecord;
}
