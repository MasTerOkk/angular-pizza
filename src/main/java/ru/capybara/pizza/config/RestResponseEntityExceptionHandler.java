package ru.capybara.pizza.config;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import ru.capybara.pizza.exception.CustomException;
import ru.capybara.pizza.exception.CustomErrorResponse;

import java.time.LocalDateTime;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler
    protected ResponseEntity<CustomErrorResponse> handleConflict(CustomException ex, WebRequest request) {
        CustomErrorResponse error = CustomErrorResponse.builder()
                .message(ex.getMessage())
                .errorDescription(ex.getErrorDescription())
                .status(ex.getStatus())
                .time(LocalDateTime.now())
                .build();
        return ResponseEntity.status(ex.getStatus()).body(error);
    }
}
