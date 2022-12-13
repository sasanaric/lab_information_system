package lis.models.requests;

import lis.models.entities.MedicalRecordEntity;
import lombok.Data;

@Data
public class BiochemistryRequest {
    private Double sGlucose;
    private Double sUrea;
    private Integer sCreatinine;
}
