package lis.models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
public class Patient {
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
