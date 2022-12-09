package lis.models.requests;

import lis.models.entities.MedicalRecordEntity;
import lombok.Data;

@Data
public class UrineRequest {
    private String uProteins;
    private String urineSediment;
}
