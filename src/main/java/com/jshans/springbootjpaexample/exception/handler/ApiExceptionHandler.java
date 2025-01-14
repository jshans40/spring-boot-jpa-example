package com.jshans.springbootjpaexample.exception.handler;

import com.jshans.springbootjpaexample.exception.ApiException;
import com.jshans.springbootjpaexample.exception.vo.ApiErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ApiException.class)
    private ResponseEntity<Object> handler(ApiException ex) {
        return new ResponseEntity<>(
                new ApiErrorResponse(ex.getApiError()),
                HttpStatus.resolve(ex.getStatus())
        );
    }
}
