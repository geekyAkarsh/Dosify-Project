package com.example.DosifyProject.controller;

import com.example.DosifyProject.dto.RequestDTO.DoctorRequestDto;
import com.example.DosifyProject.dto.ResponseDTO.DoctorResponseDto;
import com.example.DosifyProject.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    public ResponseEntity addDoctor(DoctorRequestDto doctorRequestDto){

        DoctorResponseDto doctorResponseDto = doctorService.addDoctor(doctorRequestDto);

    }


}
