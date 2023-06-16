package com.example.DosifyProject.exception;

public class DoseAlreadyTakenException extends RuntimeException{

    public DoseAlreadyTakenException(String message){
        super(message);
    }

}
