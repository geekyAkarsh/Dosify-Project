package com.example.DosifyProject.transformer;

import com.example.DosifyProject.Enum.VaccineType;
import com.example.DosifyProject.model.Dose2;
import com.example.DosifyProject.model.User;
import lombok.experimental.UtilityClass;

import java.util.UUID;

@UtilityClass
public class Dose2Transformer {

    public static Dose2 getDose2Object(User user, VaccineType vaccineType){

        return Dose2.builder()
                .doseId(String.valueOf(UUID.randomUUID()))
                .user(user)
                .vaccineType(vaccineType)
                .build();
    }
}
