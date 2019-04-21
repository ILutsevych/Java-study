package com.epam.lesson6.lesson6MVC;

import com.epam.lesson6.lesson6MVC.exceptions.*;

import java.time.LocalDate;

public class Validator {

    public static void validatePercentValue(int percentValue) throws InvalidPercentException {
        if(percentValue < -100){
            throw new InvalidPercentException();
        }
    }

    public static void valueDoesNotContainLetters (String text) throws DataAreNotLettersException {
        if (text.matches("[a-zA-Z]+")){
            throw new DataAreNotLettersException();
        }
    }

    public static void valueDoesNotContainNumbersOrPunctuation(String text) throws DataAreNotNumbersException {
        if (text.matches("^[0-9]*$")){
            throw new DataAreNotNumbersException();
        }
    }
    public static void yearIsNotBiggerThanCurrentYear (int number) throws DataNotEarlierThanCurrentYearException {
        int currentYear = LocalDate.now().getYear();
        if (number > currentYear){
            throw  new DataNotEarlierThanCurrentYearException();
        }
    }
    public static void validateNumbersOfDigitsPerYear (String text) throws IncorrectNumberDigitsForYearException {
        if (text.length() != 4){
            throw new IncorrectNumberDigitsForYearException();
        }
    }
}
