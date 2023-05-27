package com.example.DosifyProject.model;

import com.example.DosifyProject.Enum.CenterType;
import com.example.DosifyProject.Enum.VaccineType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Table(name = "Center")
public class VaccinationCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "name")
    String name;

    @Column(name = "location")
    String location;

    @Enumerated(EnumType.STRING)
    @Column(name = "center_type")
    CenterType centerType;

}
