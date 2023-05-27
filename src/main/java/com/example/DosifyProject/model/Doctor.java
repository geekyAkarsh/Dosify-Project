package com.example.DosifyProject.model;

import com.example.DosifyProject.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "name")
    String name;

    @Column(name = "age")
    Integer age;

    @Column(name = "email_id",unique = true,nullable = false)
    String emailId;

    @Column(name = "mob_no",unique = true,nullable = false)
    String mobNo;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    Gender gender;

}
