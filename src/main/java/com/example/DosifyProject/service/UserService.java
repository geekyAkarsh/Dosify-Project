package com.example.DosifyProject.service;

import com.example.DosifyProject.dto.RequestDTO.UserRequestDto;
import com.example.DosifyProject.dto.ResponseDTO.UserResponseDto;

import java.util.Optional;

public interface UserService {
    UserResponseDto addUser(UserRequestDto userRequestDto);
}
