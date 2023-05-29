package com.example.DosifyProject.service;

import com.example.DosifyProject.dto.RequestDTO.UserRequestDto;

import java.util.Optional;

public interface UserService {
    Optional<Boolean> addUser(UserRequestDto userRequestDto);
}
