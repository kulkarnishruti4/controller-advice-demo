package com.demo.controller.advice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.demo.controller.advice.entity.Response;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
    @ExceptionHandler(CustomResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(CustomResourceNotFoundException exception, WebRequest request) {
    	
    	Response response = new Response(HttpStatus.NOT_FOUND, exception.getMessage(), null);
    	
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleGlobalException(Exception exception, WebRequest request) {
    	
    	Response response = new Response(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(), request.getDescription(false));
    	
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
