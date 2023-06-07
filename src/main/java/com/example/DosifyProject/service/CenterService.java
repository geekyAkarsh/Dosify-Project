package com.example.DosifyProject.service;

import com.example.DosifyProject.dto.RequestDTO.CenterRequestDto;
import com.example.DosifyProject.dto.ResponseDTO.CenterResponseDto;

public interface CenterService {
    CenterResponseDto addCenter(CenterRequestDto centerRequestDto);
}
