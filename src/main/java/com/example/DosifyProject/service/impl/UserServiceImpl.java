package com.example.DosifyProject.service.impl;

import com.example.DosifyProject.dto.RequestDTO.UserRequestDto;
import com.example.DosifyProject.dto.ResponseDTO.UserResponseDto;
import com.example.DosifyProject.model.User;
import com.example.DosifyProject.repository.UserRepository;
import com.example.DosifyProject.service.UserService;
import com.example.DosifyProject.transformer.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserResponseDto addUser(UserRequestDto userRequestDto) {

        // convert request dto to user object
        User user = UserTransformer.userRequestDtoToUser(userRequestDto);

        // save user object
        User savedUser = userRepository.save(user);

        // convert user object to response dto and return
        return UserTransformer.userToUserResponseDto(savedUser);
    }
}
