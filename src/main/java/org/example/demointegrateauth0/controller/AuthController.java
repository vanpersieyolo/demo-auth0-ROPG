package org.example.demointegrateauth0.controller;

import org.example.demointegrateauth0.dto.LoginRequest;
import org.example.demointegrateauth0.dto.RefreshTokenRequest;
import org.example.demointegrateauth0.service.Auth0ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final Auth0ClientService auth0ClientService;

    @Autowired
    public AuthController(Auth0ClientService auth0ClientService) {
        this.auth0ClientService = auth0ClientService;
    }

    @PostMapping("/login")
    public ResponseEntity<Map<?, ?>> login(@RequestBody LoginRequest loginRequest) {
        Map<?, ?> tokens = auth0ClientService.login(
                loginRequest.getUsername(),
                loginRequest.getPassword()
        );
        return ResponseEntity.ok(tokens);
    }

    @PostMapping("/refresh")
    public ResponseEntity<Map<?, ?>> refreshToken(@RequestBody RefreshTokenRequest refreshRequest) {
        Map<?, ?> tokens = auth0ClientService.refreshToken(refreshRequest.getRefreshToken());
        return ResponseEntity.ok(tokens);
    }
}