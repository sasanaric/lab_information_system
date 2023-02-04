package lis.models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class MedicalRecord {
    private Integer id;
    private String icd;
    private String isValid;
    private Integer hematologyId;
    private Integer urineId;
    private Integer biochemistryId;
    private Integer patientId;
    private String patientFirstName;
    private String patientLastName;
    private Integer userId;
    private Timestamp createdTime;
}
