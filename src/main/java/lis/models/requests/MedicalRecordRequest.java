package lis.models.requests;

import jakarta.persistence.*;
import lis.models.entities.*;
import lombok.Data;

@Data
public class MedicalRecordRequest {
    private String icd;
    private String isValid;
    private Integer hematologyId;
    private Integer urineId;
    private Integer biochemistryId;
    private Integer patientId;
    private Integer userId;
}
