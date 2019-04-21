package com.epam.lesson6.lesson6MVC.exceptions;

public class DataAreNotLettersException extends Exception {

    public String getMessage () {
        return "The value is entered only in numbers!";
    }
}
