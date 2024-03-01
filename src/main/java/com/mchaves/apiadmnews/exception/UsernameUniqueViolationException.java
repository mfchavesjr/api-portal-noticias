package com.mchaves.apiadmnews.exception;

public class UsernameUniqueViolationException extends RuntimeException{

    public UsernameUniqueViolationException(String message){
        super(message);
    }
}
