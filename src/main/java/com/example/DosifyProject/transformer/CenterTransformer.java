package com.example.DosifyProject.transformer;


import com.example.DosifyProject.dto.RequestDTO.CenterRequestDto;
import com.example.DosifyProject.dto.RequestDTO.UserRequestDto;
import com.example.DosifyProject.dto.ResponseDTO.CenterResponseDto;
import com.example.DosifyProject.dto.ResponseDTO.UserResponseDto;
import com.example.DosifyProject.model.User;
import com.example.DosifyProject.model.VaccinationCenter;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CenterTransformer {

    public static VaccinationCenter CenterRequestDtoToVaccinationCenter(CenterRequestDto centerRequestDto){

        return VaccinationCenter.builder()
                .name(centerRequestDto.getName())
                .centerType(centerRequestDto.getCenterType())
                .location(centerRequestDto.getLocation())
                .build();
    }

    public static CenterResponseDto VaccinationCenterToCenterResponseDto(VaccinationCenter center){

        return CenterResponseDto.builder()
                .name(center.getName())
                .centerType(center.getCenterType())
                .location(center.getLocation())
                .build();
    }

}
