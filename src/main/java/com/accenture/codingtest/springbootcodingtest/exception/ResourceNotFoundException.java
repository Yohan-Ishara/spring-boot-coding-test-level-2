package com.accenture.codingtest.springbootcodingtest.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message){
        super(message);

    }
}
