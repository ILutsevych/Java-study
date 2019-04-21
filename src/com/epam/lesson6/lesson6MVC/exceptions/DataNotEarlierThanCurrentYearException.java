package com.epam.lesson6.lesson6MVC.exceptions;

public class DataNotEarlierThanCurrentYearException extends Exception {
    public String getMessage() {
        return "Year of Book publishing can not be bigger than current year!";
    }
}
