package com.example.DosifyProject.service.impl;

import com.example.DosifyProject.dto.RequestDTO.DoctorRequestDto;
import com.example.DosifyProject.dto.ResponseDTO.DoctorResponseDto;
import com.example.DosifyProject.exception.CenterNotPresentException;
import com.example.DosifyProject.model.Doctor;
import com.example.DosifyProject.model.VaccinationCenter;
import com.example.DosifyProject.repository.CenterRepository;
import com.example.DosifyProject.service.DoctorService;
import com.example.DosifyProject.transformer.DoctorTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    CenterRepository centerRepository;

    @Override
    public DoctorResponseDto addDoctor(DoctorRequestDto doctorRequestDto) throws CenterNotPresentException{

        Optional<VaccinationCenter> optionalCenter = centerRepository.findById(doctorRequestDto.getCenterId());

        if(optionalCenter.isEmpty())
            throw new CenterNotPresentException("Center Not Present in Database");

        VaccinationCenter center = optionalCenter.get();

        Doctor doctor = DoctorTransformer.DoctorRequestDtoToDoctor(doctorRequestDto);
        center.getDoctorList().add(doctor);
        centerRepository.save(center);

        return DoctorTransformer.DoctorToDoctorResponseDto(doctor);
    }
}
