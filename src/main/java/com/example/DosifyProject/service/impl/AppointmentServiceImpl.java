package com.example.DosifyProject.service.impl;

import com.example.DosifyProject.Enum.DoseNo;
import com.example.DosifyProject.dto.RequestDTO.AppointmentRequestDto;
import com.example.DosifyProject.dto.ResponseDTO.AppointmentResponseDto;
import com.example.DosifyProject.exception.DoctorNotFoundException;
import com.example.DosifyProject.exception.DoseAlreadyTakenException;
import com.example.DosifyProject.exception.NotEligibleForDoseException;
import com.example.DosifyProject.exception.UserNotFoundException;
import com.example.DosifyProject.model.*;
import com.example.DosifyProject.repository.DoctorRepository;
import com.example.DosifyProject.repository.UserRepository;
import com.example.DosifyProject.service.AppointmentService;
import com.example.DosifyProject.service.Dose1Service;
import com.example.DosifyProject.service.Dose2Service;
import com.example.DosifyProject.transformer.AppointmentTransformer;
import lombok.Builder;
import org.aspectj.weaver.ast.Not;
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
    public AppointmentResponseDto bookAppointment(AppointmentRequestDto appointmentRequestDto) throws UserNotFoundException,DoctorNotFoundException,DoseAlreadyTakenException,NotEligibleForDoseException {

        Optional<User> optionalUser = userRepository.findById(appointmentRequestDto.getUserId());
        if(optionalUser.isEmpty()){
            throw new UserNotFoundException("User doesn't exist");
        }

        Optional<Doctor> optionalDoctor = doctorRepository.findById(appointmentRequestDto.getDoctorId());
        if(optionalDoctor.isEmpty()){
            throw new DoctorNotFoundException("Doctor doesn't exist");
        }

        User user = optionalUser.get();
        Doctor doctor = optionalDoctor.get();

        if(appointmentRequestDto.getDoseNo() == DoseNo.DOSE_1){

            if(user.getIsDose1Taken() == Boolean.TRUE){
                throw new DoseAlreadyTakenException("Dose 1 already taken");
            }

            Dose1 dose1 = dose1Service.createDose1Appointment(user,appointmentRequestDto.getVaccineType());
            user.setIsDose1Taken(Boolean.TRUE);
            user.setDose1(dose1);
        }else{

            if(user.getIsDose1Taken() == Boolean.FALSE){
                throw new NotEligibleForDoseException("Dose1 not taken!!!");
            }

            if(user.getIsDose2Taken() == Boolean.TRUE){
                throw new DoseAlreadyTakenException("Dose 2 already taken");
            }

            Dose2 dose2 = dose2Service.createDose2Appointment(user,appointmentRequestDto.getVaccineType());
            user.setIsDose2Taken(Boolean.TRUE);
            user.setDose2(dose2);
        }

        Appointment appointment = AppointmentTransformer.AppointmentRequestDtoToAppointment(appointmentRequestDto);
        user.getAppointmentList().add(appointment);
        User savedUser = userRepository.save(user); // save dose1 and dose2 and appointment

        Appointment savedAppointment = savedUser.getAppointmentList().get(savedUser.getAppointmentList().size()-1);

        doctor.getAppointmentList().add(savedAppointment);
        doctorRepository.save(doctor); // optional

        return AppointmentTransformer.AppointmentToAppointmentResponseDto(savedAppointment);
    }
}
