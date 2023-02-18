package com.drs.hrgest.exception;

public class EmployeeNotFoundException extends RuntimeException{
    EmployeeNotFoundException(String message){
        super(message);
    }
}
