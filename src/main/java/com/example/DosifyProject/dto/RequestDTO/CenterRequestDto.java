package com.example.DosifyProject.dto.RequestDTO;


import com.example.DosifyProject.Enum.CenterType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CenterRequestDto {

    String name;
    String location;
    CenterType centerType;
}
