package com.example.DosifyProject.transformer;

import com.example.DosifyProject.dto.RequestDTO.UserRequestDto;
import com.example.DosifyProject.dto.ResponseDTO.UserResponseDto;
import com.example.DosifyProject.model.User;

public class UserTransformer {

    public static User userRequestDtoToUser(UserRequestDto userRequestDto){

        return User.builder()
                .name(userRequestDto.getName())
                .age(userRequestDto.getAge())
                .mobNo(userRequestDto.getMobNo())
                .emailId(userRequestDto.getEmailId())
                .gender(userRequestDto.getGender())
                .build();
    }

    public static UserResponseDto userToUserResponseDto(User user){

        return UserResponseDto.builder()
                .name(user.getName())
                .message("User registered on Dosify!")
                .build();

    }

}
