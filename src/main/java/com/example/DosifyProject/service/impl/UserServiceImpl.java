package com.example.DosifyProject.service.impl;

import com.example.DosifyProject.dto.RequestDTO.UserRequestDto;
import com.example.DosifyProject.dto.ResponseDTO.UserResponseDto;
import com.example.DosifyProject.model.User;
import com.example.DosifyProject.repository.UserRepository;
import com.example.DosifyProject.service.UserService;
import com.example.DosifyProject.transformer.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserResponseDto addUser(UserRequestDto userRequestDto) {

        User user = UserTransformer.userRequestDtoToUser(userRequestDto);

        User savedUser = userRepository.save(user);

        return UserTransformer.userToUserResponseDto(savedUser);
    }
}
