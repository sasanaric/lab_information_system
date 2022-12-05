package lis.models.requests;

import lombok.Data;

import java.sql.Date;

@Data
public class PatientRequest {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String jmbg;
    private String gender;
    private String address;
    private String phone;
    private String city;
    private String familyDoctor;
}
