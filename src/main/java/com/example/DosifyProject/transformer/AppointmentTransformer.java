package com.example.DosifyProject.transformer;

import com.example.DosifyProject.Enum.VaccineType;
import com.example.DosifyProject.dto.RequestDTO.AppointmentRequestDto;
import com.example.DosifyProject.dto.ResponseDTO.AppointmentResponseDto;
import com.example.DosifyProject.model.Appointment;
import com.example.DosifyProject.model.User;
import com.example.DosifyProject.repository.DoctorRepository;
import com.example.DosifyProject.repository.UserRepository;
import lombok.experimental.UtilityClass;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

@UtilityClass
public class AppointmentTransformer {

    @Autowired
    UserRepository userRepository;

    @Autowired
    DoctorRepository doctorRepository;

    public static Appointment AppointmentRequestDtoToAppointment(AppointmentRequestDto appointmentRequestDto){

        return Appointment.builder()
                .appointmentNo(String.valueOf(UUID.randomUUID()))
                .user(userRepository.getById(appointmentRequestDto.getUserId()))
                .doseNo(appointmentRequestDto.getDoseNo())
                .doctor(doctorRepository.getById(appointmentRequestDto.getDoctorId()))
                .build();
    }

    public static AppointmentResponseDto AppointmentToAppointmentResponseDto(Appointment appointment){

        VaccineType vaccineType = null;
        User user = appointment.getUser();
        if(user.getIsDose2Taken() == Boolean.TRUE){
            vaccineType = user.getDose2().getVaccineType();
        }else{
            vaccineType = user.getDose1().getVaccineType();
        }

        return AppointmentResponseDto.builder()
                .appointmentNo(appointment.getAppointmentNo())
                .doseNo(appointment.getDoseNo())
                .vaccineType(vaccineType)
                .userName(appointment.getUser().getName())
                .doctorName(appointment.getDoctor().getName())
                .dateOfAppointment(appointment.getDateOfAppointment())
                .centerResponseDto(CenterTransformer.VaccinationCenterToCenterResponseDto(appointment.getDoctor().getVaccinationCenter()))
                .build();
    }

}
