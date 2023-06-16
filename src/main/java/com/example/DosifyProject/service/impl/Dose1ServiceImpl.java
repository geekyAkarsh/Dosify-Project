package com.example.DosifyProject.service.impl;

import com.example.DosifyProject.Enum.VaccineType;
import com.example.DosifyProject.model.Dose1;
import com.example.DosifyProject.model.User;
import com.example.DosifyProject.repository.Dose1Repository;
import com.example.DosifyProject.service.Dose1Service;
import com.example.DosifyProject.transformer.Dose1Transformer;
import org.springframework.beans.factory.annotation.Autowired;

public class Dose1ServiceImpl implements Dose1Service {

    @Override
    public Dose1 createDose1Appointment(User user, VaccineType vaccineType) {

        Dose1 dose1 = Dose1Transformer.getDose1Object(user,vaccineType);
        return dose1;
    }
}
