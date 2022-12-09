package lis.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class MedicalRecord {
    private String icd;
    private String isValid;
    private Integer hematologyId;
    private Integer urineId;
    private Integer biochemistryId;
    private Integer patientId;
    private Integer userId;
}
