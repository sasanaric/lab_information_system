package lis.models.requests;

import jakarta.persistence.*;
import lis.models.entities.MedicalRecordEntity;
import lombok.Data;

import java.util.List;
@Data
public class UserRequest {
    private String username;
    private String firstName;
    private String lastName;
    private String specialization;
    private String password;
    private String role;

}
