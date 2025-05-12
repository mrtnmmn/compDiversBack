package com.avalon.compDivers.api.controllers;

import com.avalon.compDivers.api.dto.AuthRequest;
import com.avalon.compDivers.api.dto.AuthResponse;
import com.avalon.compDivers.api.models.User;
import com.avalon.compDivers.api.services.UserService;
import com.avalon.compDivers.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody AuthRequest request) {
        userService.register(request.username, request.password);
        return ResponseEntity.ok("User registered");
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request) {
        User user = userService.login(request.username, request.password);
        String token = jwtUtil.generateToken(user.getUsername());
        System.out.println("Login " + token);
        return ResponseEntity.ok(new AuthResponse(token));
    }
}