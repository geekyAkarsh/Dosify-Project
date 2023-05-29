package com.example.DosifyProject.dto.RequestDTO;


import com.example.DosifyProject.Enum.Gender;
import jdk.jfr.Name;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DoctorRequestDto {

    String name;
    Integer age;
    String mobNo;
    String emailId;
    Gender gender;
}
