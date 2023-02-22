package lis.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class Borders {
    private Integer id;
    private Double sGlucoseLow;
    private Double sGlucoseHigh;
    private Double sUreaLow;
    private Double sUreaHigh;
    private Double sCreatinineLow;
    private Double sCreatinineHigh;
    private Double leukocytesLow;
    private Double leukocytesHigh;
    private Double erythrocytesLow;
    private Double erythrocytesHigh;
    private Double hemaglobinLow;
    private Double hemaglobinHigh;
    private Double hematocritLow;
    private Double hematocritHigh;
    private Double plateletsLow;
    private Double plateletsHigh;
}
