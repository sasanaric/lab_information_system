package lis.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Objects;
@Data
@Entity
@Table(name = "hematology")
@EntityListeners(AuditingEntityListener.class)

public class HematologyEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "leukocytes", nullable = false, precision = 0)
    private Integer leukocytes;
    @Basic
    @Column(name = "erythrocytes", nullable = false, precision = 0)
    private Integer erythrocytes;
    @Basic
    @Column(name = "hemaglobin", nullable = false, precision = 0)
    private Integer hemaglobin;
    @Basic
    @Column(name = "hematocrit", nullable = false, precision = 0)
    private Integer hematocrit;
    @Basic
    @Column(name = "platelets", nullable = false, precision = 0)
    private Integer platelets;
    @OneToOne(mappedBy = "hematology")
    private MedicalRecordEntity medicalRecord;
}
