package com.example.libbackend.controller;// AdminController.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.libbackend.model.Admin;
import com.example.libbackend.service.AdminService;

@RestController
@RequestMapping("/api/auth")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/adminregister")
    public ResponseEntity<?> registerAdmin(@RequestBody Admin admin) {
        try {

            // Save the admin
            Admin savedAdmin = adminService.registerAdmin(admin);
            return ResponseEntity.ok(savedAdmin);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Registration failed: " + e.getMessage());
        }
    }
}
