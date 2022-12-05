package lis.models.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Data
@Entity
@Table(name = "patient")
public class PatientEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;
    @Basic
    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;
    @Basic
    @Column(name = "birth_date", nullable = false)
    private Date birthDate;
    @Basic
    @Column(name = "jmbg", nullable = false, length = 13)
    private String jmbg;
    @Basic
    @Column(name = "adress", nullable = false, length = 100)
    private String adress;
    @Basic
    @Column(name = "phone", nullable = false, length = 15)
    private String phone;
    @Basic
    @Column(name = "city", nullable = false, length = 45)
    private String city;
    @Basic
    @Column(name = "family_doctor", nullable = false, length = 45)
    private String familyDoctor;
    @OneToMany(mappedBy = "patient")
    private List<MedicalRecordEntity> medicalRecords;
}
