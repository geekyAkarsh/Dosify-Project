package com.example.DosifyProject.service;

import com.example.DosifyProject.dto.RequestDTO.DoctorRequestDto;
import com.example.DosifyProject.dto.ResponseDTO.DoctorResponseDto;

public interface DoctorService {
    DoctorResponseDto addDoctor(DoctorRequestDto doctorRequestDto);
}
