package com.example.practica2;

public class IncorrectHoursException extends RuntimeException {

    public IncorrectHoursException() {
        super("Hora final menor que hora inicio");
    }

}
