package com.darthcow.projects.spring.payroll;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

// Indicates following class handle exceptions globally
@ControllerAdvice
// Class for rendering an http 404
public class EmployeeNotFoundAdvice {
    @ResponseBody // Indicates that the return type will be the response body
    @ExceptionHandler(EmployeeNotFoundException.class) // advice will only respond if specified exception is thrown
    @ResponseStatus(HttpStatus.NOT_FOUND)
        // Which will be the response status
    String employeeNotFoundHandler(EmployeeNotFoundException exception) {
        return exception.getMessage();
    }

}
