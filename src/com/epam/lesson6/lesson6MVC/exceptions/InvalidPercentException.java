package com.epam.lesson6.lesson6MVC.exceptions;

public class InvalidPercentException extends Exception {
    @Override
    public String getMessage() {
        return "Percent value is less then -100!";
    }
}
