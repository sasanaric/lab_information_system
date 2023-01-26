package lis.models;

import lombok.Data;

@Data
public class UserResponse {
    private Integer id;
    private String username;
    private String firstName;
    private String lastName;
    private String specialization;
    private String role;
}
