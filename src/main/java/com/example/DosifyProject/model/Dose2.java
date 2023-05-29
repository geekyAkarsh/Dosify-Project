package com.example.DosifyProject.model;

import com.example.DosifyProject.Enum.VaccineType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Table(name = "dose2")
public class Dose2 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column(name = "dose_id")
    String doseId; // generated using uuid

    @Enumerated(EnumType.STRING)
    @Column(name = "vaccine_type")
    VaccineType vaccineType;

    @CreationTimestamp
    @Column(name = "vaccination_date")
    Date date;

    @OneToOne
    @JoinColumn
    User user;
}
