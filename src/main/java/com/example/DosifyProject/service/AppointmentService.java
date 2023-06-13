package com.example.DosifyProject.service;

import com.example.DosifyProject.dto.RequestDTO.AppointmentRequestDto;
import com.example.DosifyProject.dto.ResponseDTO.AppointmentResponseDto;

public interface AppointmentService {

    public AppointmentResponseDto bookAppointment(AppointmentRequestDto appointmentRequestDto);

}
