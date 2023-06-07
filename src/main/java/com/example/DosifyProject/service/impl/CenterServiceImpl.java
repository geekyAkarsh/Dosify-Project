package com.example.DosifyProject.service.impl;

import com.example.DosifyProject.dto.RequestDTO.CenterRequestDto;
import com.example.DosifyProject.dto.ResponseDTO.CenterResponseDto;
import com.example.DosifyProject.model.VaccinationCenter;
import com.example.DosifyProject.repository.CenterRepository;
import com.example.DosifyProject.service.CenterService;
import com.example.DosifyProject.transformer.CenterTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CenterServiceImpl implements CenterService {

    @Autowired
    CenterRepository centerRepository;

    @Override
    public CenterResponseDto addCenter(CenterRequestDto centerRequestDto) {

        VaccinationCenter center = CenterTransformer.CenterRequestDtoToVaccinationCenter(centerRequestDto);

        VaccinationCenter savedCenter = centerRepository.save(center);

        return CenterTransformer.VaccinationCenterToCenterResponseDto(savedCenter);
    }
}
