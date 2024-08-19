package ru.capybara.pizza.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test") //http://localhost:8080/api/test
public class TestController {
    @GetMapping
    public String test() {
        return "Hello";
    }
}
