package com.example.DosifyProject.dto.ResponseDTO;

import com.example.DosifyProject.Enum.DoseNo;
import com.example.DosifyProject.Enum.VaccineType;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AppointmentResponseDto {

    String userName;
    String doctorName;
    String appointmentNo;
    Date dateOfAppointment;
    DoseNo doseNo;
    VaccineType vaccineType;
    CenterResponseDto centerResponseDto;
}
