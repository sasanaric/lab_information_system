package lis.models.entities;

import jakarta.persistence.*;
import lis.base.BaseEntity;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Objects;
@Data
@Entity
@Table(name = "hematology")
@EntityListeners(AuditingEntityListener.class)

public class HematologyEntity implements BaseEntity<Integer> {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "leukocytes", nullable = false, precision = 0)
    private Double leukocytes;
    @Basic
    @Column(name = "erythrocytes", nullable = false, precision = 0)
    private Double erythrocytes;
    @Basic
    @Column(name = "hemaglobin", nullable = false, precision = 0)
    private Double hemaglobin;
    @Basic
    @Column(name = "hematocrit", nullable = false, precision = 0)
    private Double hematocrit;
    @Basic
    @Column(name = "platelets", nullable = false, precision = 0)
    private Double platelets;
    @OneToOne(mappedBy = "hematology")
    private MedicalRecordEntity medicalRecord;
}
