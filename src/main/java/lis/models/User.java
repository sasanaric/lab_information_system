package lis.models;

import jakarta.persistence.*;
import lis.models.entities.MedicalRecordEntity;
import lombok.Data;

import java.util.List;
@Data
public class User {
    private Integer id;
    private String username;
    private String firstName;
    private String lastName;
    private String specialization;
    private String password;
    private String role;
}
