package com.example.DosifyProject.service.impl;

import com.example.DosifyProject.dto.RequestDTO.UserRequestDto;
import com.example.DosifyProject.service.UserService;

import java.util.Optional;

public class UserServiceImpl implements UserService {


    @Override
    public Optional<Boolean> addUser(UserRequestDto userRequestDto) {
        return Optional.empty();
    }
}
