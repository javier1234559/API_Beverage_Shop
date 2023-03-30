package com.example.api_beverage_shop.controller;

import com.example.api_beverage_shop.dto.request.*;
import com.example.api_beverage_shop.security.auth.IAuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    @Autowired
    private final IAuthenticationService authenticationService;

//    @Autowired
//    private final IUserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authenticationService.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> authenticate(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authenticationService.authenticate(request));
    }

//    @PostMapping("/refresh")
//    public ResponseEntity<?> refresh(@Valid @RequestBody TokenRefreshRequest request) {
//        return ResponseEntity.ok(authenticationService.refresh(request));
//    }
}
