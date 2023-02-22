package lis.models.entities;

import jakarta.persistence.*;
import lis.base.BaseEntity;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@Entity
@Table(name = "borders")
@EntityListeners(AuditingEntityListener.class)

public class BordersEntity implements BaseEntity<Integer> {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "s_glucose_low")
    private Double sGlucoseLow;
    @Basic
    @Column(name = "s_glucose_high")
    private Double sGlucoseHigh;
    @Basic
    @Column(name = "s_urea_low")
    private Double sUreaLow;
    @Basic
    @Column(name = "s_urea_high")
    private Double sUreaHigh;
    @Basic
    @Column(name = "s_creatinine_low")
    private Double sCreatinineLow;
    @Basic
    @Column(name = "s_creatinine_high")
    private Double sCreatinineHigh;
    @Basic
    @Column(name = "leukocytes_low")
    private Double leukocytesLow;
    @Basic
    @Column(name = "leukocytes_high")
    private Double leukocytesHigh;
    @Basic
    @Column(name = "erythrocytes_low")
    private Double erythrocytesLow;
    @Basic
    @Column(name = "erythrocytes_high")
    private Double erythrocytesHigh;
    @Basic
    @Column(name = "hemaglobin_low")
    private Double hemaglobinLow;
    @Basic
    @Column(name = "hemaglobin_high")
    private Double hemaglobinHigh;
    @Basic
    @Column(name = "hematocrit_low")
    private Double hematocritLow;
    @Basic
    @Column(name = "hematocrit_high")
    private Double hematocritHigh;
    @Basic
    @Column(name = "platelets_low")
    private Double plateletsLow;
    @Basic
    @Column(name = "platelets_high")
    private Double plateletsHigh;



}
