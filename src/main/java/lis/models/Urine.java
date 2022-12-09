package lis.models;

import jakarta.persistence.*;
import lis.models.entities.MedicalRecordEntity;
import lombok.Data;

@Data
public class Urine {
    private Integer id;
    private String uProteins;
    private String urineSediment;
}
