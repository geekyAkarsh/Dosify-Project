package com.example.DosifyProject.service.impl;

import com.example.DosifyProject.dto.RequestDTO.AppointmentRequestDto;
import com.example.DosifyProject.dto.ResponseDTO.AppointmentResponseDto;
import com.example.DosifyProject.exception.DoctorNotFoundException;
import com.example.DosifyProject.exception.UserNotFoundException;
import com.example.DosifyProject.model.Doctor;
import com.example.DosifyProject.model.User;
import com.example.DosifyProject.repository.DoctorRepository;
import com.example.DosifyProject.repository.UserRepository;
import com.example.DosifyProject.service.AppointmentService;
import com.example.DosifyProject.service.Dose1Service;
import com.example.DosifyProject.service.Dose2Service;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    Dose1Service dose1Service;
    @Autowired
    Dose2Service dose2Service;

    @Override
    public AppointmentResponseDto bookAppointment(AppointmentRequestDto appointmentRequestDto) {

        Optional<User> optionalUser = userRepository.findById(appointmentRequestDto.getUserId());
        if(optionalUser.isEmpty()){
            throw new UserNotFoundException("User not found");
        }

        Optional<Doctor> optionalDoctor = doctorRepository.findById(appointmentRequestDto.getDoctorId());
        if(optionalDoctor.isEmpty()){
            throw new DoctorNotFoundException("Doctor not found");
        }

        User user = optionalUser.get();
        Doctor doctor = optionalDoctor.get();


    }
}
