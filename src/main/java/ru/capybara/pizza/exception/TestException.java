package ru.capybara.pizza.exception;


import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class TestException extends CustomException {
    static String massage = "User with id=%d not found.";
    static String errorDescription = "user.exception.not-found";
    static HttpStatus status = HttpStatus.NOT_FOUND;
    public TestException(int userId) {
        super(String.format(massage, userId), errorDescription, status, LocalDateTime.now());
    }
}
