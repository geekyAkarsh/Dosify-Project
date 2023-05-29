package com.example.DosifyProject.controller;

import com.example.DosifyProject.dto.RequestDTO.UserRequestDto;
import com.example.DosifyProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    // add user
    @PostMapping("/add")
    public ResponseEntity addUser(@RequestBody UserRequestDto userRequestDto){

        try {
            Optional<Boolean> added = userService.addUser(userRequestDto);
        }catch (Exception ex){

        }
    }

    // find by emailId
    @GetMapping("/get")
    public


}
