package com.example.DosifyProject.transformer;

import com.example.DosifyProject.Enum.VaccineType;
import com.example.DosifyProject.model.Dose1;
import com.example.DosifyProject.model.User;
import lombok.experimental.UtilityClass;

import java.util.UUID;

@UtilityClass
public class Dose1Transformer {

    public static Dose1 getDose1Object(User user, VaccineType vaccineType){

        return Dose1.builder()
                .doseId(String.valueOf(UUID.randomUUID()))
                .user(user)
                .vaccineType(vaccineType)
                .build();
    }

}
