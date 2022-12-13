package lis.models;

import jakarta.persistence.*;
import lis.models.entities.MedicalRecordEntity;
import lombok.Data;

@Data
public class Biochemistry {
    private Integer id;
    private Double sGlucose;
    private Double sUrea;
    private Integer sCreatinine;
}
