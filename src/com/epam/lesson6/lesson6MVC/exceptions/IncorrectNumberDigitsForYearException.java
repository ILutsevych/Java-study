package com.epam.lesson6.lesson6MVC.exceptions;

public class IncorrectNumberDigitsForYearException extends Exception {
    public String getMessage() {
        return "Number of digits for year is not 4!";
    }
}
