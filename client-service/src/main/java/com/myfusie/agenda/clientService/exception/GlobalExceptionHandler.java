package com.myfusie.agenda.clientService.exception;

import lombok.extern.flogger.Flogger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,String>> handleValidationException(
            MethodArgumentNotValidException ex){

        Map<String,String> errors=new HashMap<>();
        System.out.println( ex.getBindingResult().getFieldErrors());
        ex.getBindingResult().getFieldErrors()
                .forEach(error -> errors.put(
                        error.getField(),
                        error.getDefaultMessage()
                ));

        return ResponseEntity.badRequest().body(errors);
    }


}
