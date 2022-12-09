package lis.models.entities;

import jakarta.persistence.*;
import lis.base.BaseEntity;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Objects;

@Data
@Entity
@Table(name = "urine")
@EntityListeners(AuditingEntityListener.class)

public class UrineEntity implements BaseEntity<Integer> {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "u-proteins", nullable = false, length = 60)
    private String uProteins;
    @Basic
    @Column(name = "urine_sediment", nullable = false, length = 100)
    private String urineSediment;
    @OneToOne(mappedBy = "urine")
    private MedicalRecordEntity medicalRecord;
}
