package lis.models.requests;

import lombok.Data;

@Data
public class RegisterRequest {
    private String username;
    private String firstName;
    private String lastName;
    private String specialization;
    private String password;
    private String role;
}
