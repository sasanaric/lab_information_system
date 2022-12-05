package lis.models.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Data
@Entity
@Table(name = "urine", schema = "lab_information_system", catalog = "")
public class UrineEntity {
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
