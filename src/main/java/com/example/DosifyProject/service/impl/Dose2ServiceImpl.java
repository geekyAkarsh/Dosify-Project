package com.example.DosifyProject.service.impl;

import com.example.DosifyProject.Enum.VaccineType;
import com.example.DosifyProject.model.Dose2;
import com.example.DosifyProject.model.User;
import com.example.DosifyProject.service.Dose2Service;
import com.example.DosifyProject.transformer.Dose2Transformer;
import org.springframework.stereotype.Service;

@Service
public class Dose2ServiceImpl implements Dose2Service {

    @Override
    public Dose2 createDose2Appointment(User user, VaccineType vaccineType) {

        Dose2 dose2 = Dose2Transformer.getDose2Object(user,vaccineType);
        return dose2;
    }
}
