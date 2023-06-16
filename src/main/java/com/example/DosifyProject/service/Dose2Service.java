package com.example.DosifyProject.service;

import com.example.DosifyProject.Enum.VaccineType;
import com.example.DosifyProject.model.Dose2;
import com.example.DosifyProject.model.User;

public interface Dose2Service {
    public Dose2 createDose2Appointment(User user, VaccineType vaccineType);
}
