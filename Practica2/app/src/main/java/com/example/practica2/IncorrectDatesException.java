package com.example.practica2;

public class IncorrectDatesException extends RuntimeException {

    public IncorrectDatesException() {
        super("Fecha de inicio posterior a la fecha final");
    }

}
