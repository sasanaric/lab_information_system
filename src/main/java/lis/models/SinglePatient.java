package lis.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class SinglePatient extends Patient{
    private List<MedicalRecord> medicalRecords;
}
