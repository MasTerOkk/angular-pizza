package ru.capybara.pizza.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dev") //http://localhost:8080/api/dev
public class DevController {
    @GetMapping
    public String getCurrentUserData() {
        return SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
    }
}
