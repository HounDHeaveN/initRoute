package com.example.initRoute.controller;

import com.example.initRoute.security.AuthRequest;
import com.example.initRoute.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/init")
    public Map<String, String> authenticate(@RequestBody AuthRequest request) {
        Map<String, String> response = new HashMap<>();
        try {
            String token = authService.authenticate(request.getUsername(), request.getPassword());
            response.put("token", token);
        } catch (Exception e) {
            response.put("error", e.getMessage());
        }
        return response;
    }

    @PostMapping("/register")
    public Map<String, String> register(@RequestParam String username, @RequestParam String password) {
        Map<String, String> response = new HashMap<>();
        try {
            authService.register(username, password);
            response.put("message", "User registered successfully");
        } catch (Exception e) {
            response.put("error", e.getMessage());
        }
        return response;
    }
}


