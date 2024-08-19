package ru.capybara.pizza.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/security") //http://localhost:8080/api/security
public class AuthController {
    @PostMapping(value = "/login")
    public ResponseEntity<String> login() {
        return ResponseEntity.ok().body("login");
    }

    @PostMapping(value = "/register")
    public ResponseEntity<String> register() {
        return ResponseEntity.ok().body("register");
    }
}
