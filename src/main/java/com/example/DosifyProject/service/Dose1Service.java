package com.example.DosifyProject.service;

import com.example.DosifyProject.Enum.VaccineType;
import com.example.DosifyProject.model.User;

public interface Dose1Service {

    public void createDose1Appointment(User user, VaccineType vaccineType);

}
