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
    @Column(name = "s-glucose-low")
    private Double sGlucoseLow;
    @Basic
    @Column(name = "s-glucose-high")
    private Double sGlucoseHigh;
    @Basic
    @Column(name = "s-urea-low")
    private Double sUreaLow;
    @Basic
    @Column(name = "s-urea-high")
    private Double sUreaHigh;
    @Basic
    @Column(name = "s-creatinine-low")
    private Double sCreatinineLow;
    @Basic
    @Column(name = "s-creatinine-high")
    private Double sCreatinineHigh;
    @Basic
    @Column(name = "leukocytes-low")
    private Double leukocytesLow;
    @Basic
    @Column(name = "leukocytes-high")
    private Double leukocytesHigh;
    @Basic
    @Column(name = "erythrocytes-low")
    private Double erythrocytesLow;
    @Basic
    @Column(name = "erythrocytes-high")
    private Double erythrocytesHigh;
    @Basic
    @Column(name = "hemaglobin-low")
    private Double hemaglobinLow;
    @Basic
    @Column(name = "hemaglobin-high")
    private Double hemaglobinHigh;
    @Basic
    @Column(name = "hematocrit-low")
    private Double hematocritLow;
    @Basic
    @Column(name = "hematocrit-high")
    private Double hematocritHigh;
    @Basic
    @Column(name = "platelets-low")
    private Double plateletsLow;
    @Basic
    @Column(name = "platelets-high")
    private Double plateletsHigh;



}
