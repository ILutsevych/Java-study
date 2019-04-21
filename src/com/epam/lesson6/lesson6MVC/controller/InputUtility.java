package com.epam.lesson6.lesson6MVC.controller;

import com.epam.lesson6.lesson6MVC.Validator;
import com.epam.lesson6.lesson6MVC.exceptions.*;
import com.epam.lesson6.lesson6MVC.view.BooksView;

import java.util.Scanner;

public class InputUtility {

    private static Scanner sc = new Scanner(System.in);

    public static int inputPercentValueWithScanner (BooksView view) {
        view.printMessage(view.ENTER_AMOUNT_OF_PERCENT);
        while (sc.hasNext()) {
            String value = sc.next();
            try {
                Validator.valueDoesNotContainLetters(value);
                Validator.validatePercentValue(Integer.parseInt(value));
                return Integer.parseInt(value);
            } catch (DataAreNotLettersException | InvalidPercentException e) {
                System.err.println(e.getMessage());
            }
        }
        return -1;
    }
    public static String inputBooksAuthorWithScanner (BooksView view) {
        view.printMessage(view.ENTER_BOOKS_AUTHOR);
        while(sc.hasNext()) {
            String value = sc.next();
            try {
                Validator.valueDoesNotContainNumbersOrPunctuation(value);
                return value;
        } catch (DataAreNotNumbersException e){
                System.err.println(e.getMessage());
            }
        }
        return null;
    }
    public static int inputBookYearWithScanner (BooksView view) {
        view.printMessage(view.ENTER_THE_YEAR);
        while (sc.hasNext()) {
            String value = sc.next();
            try {
                Validator.valueDoesNotContainLetters(value);
                Validator.validateNumbersOfDigitsPerYear(value);
                Validator.yearIsNotBiggerThanCurrentYear(Integer.parseInt(value));
                return Integer.parseInt(value);
            } catch (DataAreNotLettersException | IncorrectNumberDigitsForYearException | DataNotEarlierThanCurrentYearException e) {
                System.err.println(e.getMessage());
            }
        }
        return -1;
    }
}
