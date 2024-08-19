package ru.capybara.pizza.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.capybara.pizza.dto.AuthRequest;
import ru.capybara.pizza.dto.AuthenticationResponse;
import ru.capybara.pizza.dto.RegisterRequest;
import ru.capybara.pizza.service.AuthenticationService;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequestMapping("/api/security") //http://localhost:8080/api/security
public class AuthController {

    AuthenticationService authenticationService;
    @PostMapping(value = "/login")
    public ResponseEntity<AuthenticationResponse> auth(@RequestBody AuthRequest request) {
        return ResponseEntity.ok().body(authenticationService.auth(request));
    }

    @PostMapping(value = "/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok().body(authenticationService.register(request));
    }
}
