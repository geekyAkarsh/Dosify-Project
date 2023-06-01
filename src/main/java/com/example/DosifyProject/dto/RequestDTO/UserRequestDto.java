package com.example.DosifyProject.dto.RequestDTO;

import com.example.DosifyProject.Enum.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;


@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDto {

    String name;
    Integer age;
    String emailId;
    String mobNo;
    Gender gender;
}
