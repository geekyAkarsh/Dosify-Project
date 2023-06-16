package com.example.DosifyProject.controller;

import com.example.DosifyProject.dto.RequestDTO.AppointmentRequestDto;
import com.example.DosifyProject.dto.ResponseDTO.AppointmentResponseDto;
import com.example.DosifyProject.exception.DoctorNotFoundException;
import com.example.DosifyProject.exception.DoseAlreadyTakenException;
import com.example.DosifyProject.exception.NotEligibleForDoseException;
import com.example.DosifyProject.exception.UserNotFoundException;
import com.example.DosifyProject.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;

    @PostMapping("/book")
    public ResponseEntity bookAppointment(@RequestBody AppointmentRequestDto appointmentRequestDto){

        try {
            AppointmentResponseDto appointmentResponseDto = appointmentService.bookAppointment(appointmentRequestDto);
            return new ResponseEntity(appointmentResponseDto,HttpStatus.CREATED);
        } catch (DoseAlreadyTakenException exception){
            return new ResponseEntity(exception.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (NotEligibleForDoseException exception){
            return new ResponseEntity(exception.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (UserNotFoundException exception){
            return new ResponseEntity(exception.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (DoctorNotFoundException exception){
            return new ResponseEntity(exception.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

}
