package com.example.libbackend.controller;

import com.example.libbackend.model.User;
import com.example.libbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/api/auth/userregister")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }
}
