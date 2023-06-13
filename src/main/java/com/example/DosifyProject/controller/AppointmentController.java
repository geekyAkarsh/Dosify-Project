package com.example.DosifyProject.controller;

import com.example.DosifyProject.dto.RequestDTO.AppointmentRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    public ResponseEntity bookAppointment(@RequestBody AppointmentRequestDto appointmentRequestDto){





    }

}
