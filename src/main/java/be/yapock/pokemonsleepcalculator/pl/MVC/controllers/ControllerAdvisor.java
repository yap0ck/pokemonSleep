package be.yapock.pokemonsleepcalculator.pl.MVC.controllers;

import be.yapock.pokemonsleepcalculator.pl.models.error.Error;
import jakarta.persistence.EntityNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class ControllerAdvisor {
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<Error> entityNotFound(EntityNotFoundException e, HttpServletRequest request){
        Error error = Error.builder()
                .status(HttpStatus.NOT_FOUND)
                .message(e.getMessage())
                .requestMadeAt(LocalDateTime.now())
                .URI(request.getRequestURI())
                .build();

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(error);
    }
}
