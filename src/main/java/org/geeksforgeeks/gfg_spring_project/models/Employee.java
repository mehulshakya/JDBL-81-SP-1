package org.geeksforgeeks.gfg_spring_project.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Builder
@With
@Getter
@Setter
@Entity
@Table(name = "employee")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "dob", nullable = false)
    private Instant dateOfBirth;

    @Column(name = "doj")
    private Instant joiningDate;

    @Column(name = "salary", nullable = false)
    private double salary;

    @Column(name = "designation", nullable = false)
    private String designation;

    @Column(name = "email", nullable = false)
    private String email;
}
