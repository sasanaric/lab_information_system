package lis.models;

import lis.models.entities.MedicalRecordEntity;
import lombok.Data;

import java.util.List;

@Data
public class SingleUser extends User{
    private List<MedicalRecord> medicalRecords;
}
