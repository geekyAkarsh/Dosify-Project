package com.example.DosifyProject.dto.RequestDTO;

import com.example.DosifyProject.Enum.DoseNo;
import com.example.DosifyProject.Enum.VaccineType;
import jakarta.annotation.security.DenyAll;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AppointmentRequestDto {

    DoseNo doseNo;
    Integer userId;
    Integer doctorId;
    VaccineType vaccineType;
}
