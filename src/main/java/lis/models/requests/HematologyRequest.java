package lis.models.requests;

import lis.models.entities.MedicalRecordEntity;
import lombok.Data;

@Data
public class HematologyRequest {
    private Double leukocytes;
    private Double erythrocytes;
    private Double hemaglobin;
    private Double hematocrit;
    private Double platelets;
}
