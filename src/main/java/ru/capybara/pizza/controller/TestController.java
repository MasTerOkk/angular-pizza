package ru.capybara.pizza.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.capybara.pizza.exception.TestException;

@RestController
@RequestMapping("/api/test") //http://localhost:8080/api/test
public class TestController {
    @GetMapping
    public String test() {
        return SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
    }

    @GetMapping("/err")
    public ResponseEntity<String> getError(@RequestParam boolean flag) {
        if (flag) {
            throw new RuntimeException("No no no mister fish");
        } else {
            throw new TestException(1);
        }
    }
}
