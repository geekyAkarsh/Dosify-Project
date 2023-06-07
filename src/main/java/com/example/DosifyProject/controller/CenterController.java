package com.example.DosifyProject.controller;

import com.example.DosifyProject.dto.RequestDTO.CenterRequestDto;
import com.example.DosifyProject.dto.ResponseDTO.CenterResponseDto;
import com.example.DosifyProject.service.CenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/center")
public class CenterController {

    @Autowired
    CenterService centerService;

    @PostMapping("/add")
    public ResponseEntity addCenter(@RequestBody CenterRequestDto centerRequestDto){

        CenterResponseDto centerResponseDto = centerService.addCenter(centerRequestDto);

        return new ResponseEntity(centerResponseDto, HttpStatusCode.valueOf(201));
    }

}
