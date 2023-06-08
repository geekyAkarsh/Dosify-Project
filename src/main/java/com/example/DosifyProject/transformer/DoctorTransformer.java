package com.example.DosifyProject.transformer;

import com.example.DosifyProject.dto.RequestDTO.DoctorRequestDto;
import com.example.DosifyProject.model.Doctor;
import com.example.DosifyProject.model.VaccinationCenter;
import com.example.DosifyProject.service.CenterService;
import lombok.experimental.UtilityClass;
import org.springframework.beans.factory.annotation.Autowired;

@UtilityClass
public class DoctorTransformer {

    @Autowired
    CenterService centerService;
    public static Doctor DoctorRequestDtoToDoctor(DoctorRequestDto doctorRequestDto){

        return Doctor.builder()
                .name(doctorRequestDto.getName())
                .age(doctorRequestDto.getAge())
                .mobNo(doctorRequestDto.getMobNo())
                .emailId(doctorRequestDto.getEmailId())
                .gender(doctorRequestDto.getGender())
                .vaccinationCenter(centerService.)
                .build();

    }

}
