package lis.models;

import jakarta.persistence.*;
import lis.models.entities.MedicalRecordEntity;
import lombok.Data;

@Data
public class Hematology {
    private Integer id;
    private Double leukocytes;
    private Double erythrocytes;
    private Double hemaglobin;
    private Double hematocrit;
    private Double platelets;
}
