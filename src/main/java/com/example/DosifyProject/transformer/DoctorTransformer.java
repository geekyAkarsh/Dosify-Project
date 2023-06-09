package com.example.DosifyProject.transformer;

import com.example.DosifyProject.dto.RequestDTO.DoctorRequestDto;
import com.example.DosifyProject.dto.ResponseDTO.CenterResponseDto;
import com.example.DosifyProject.dto.ResponseDTO.DoctorResponseDto;
import com.example.DosifyProject.model.Doctor;
import com.example.DosifyProject.model.VaccinationCenter;
import com.example.DosifyProject.service.CenterService;
import lombok.experimental.UtilityClass;
import org.springframework.beans.factory.annotation.Autowired;

@UtilityClass
public class DoctorTransformer {


    public static Doctor DoctorRequestDtoToDoctor(DoctorRequestDto doctorRequestDto){

        return Doctor.builder()
                .name(doctorRequestDto.getName())
                .age(doctorRequestDto.getAge())
                .mobNo(doctorRequestDto.getMobNo())
                .emailId(doctorRequestDto.getEmailId())
                .gender(doctorRequestDto.getGender())
                .build();
    }

    public static DoctorResponseDto DoctorToDoctorResponseDto(Doctor doctor){

        CenterResponseDto centerResponseDto = CenterTransformer.VaccinationCenterToCenterResponseDto(doctor.getVaccinationCenter());

        return DoctorResponseDto.builder()
                .name(doctor.getName())
                .emailId(doctor.getEmailId())
                .mobNo(doctor.getMobNo())
                .centerResponseDto(centerResponseDto)
                .build();
    }


}
