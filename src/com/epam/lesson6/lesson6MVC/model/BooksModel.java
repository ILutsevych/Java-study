package com.epam.lesson6.lesson6MVC.model;

import com.epam.lesson6.lesson6MVC.comparators.AuthorComparator;
import com.epam.lesson6.lesson6MVC.comparators.PriceComparator;
import com.epam.lesson6.lesson6MVC.comparators.PublisherComparator;
import com.epam.lesson6.lesson6MVC.view.BooksView;
import com.epam.lesson6.lesson6MVC.controller.InputUtility;

import java.util.Arrays;

public class BooksModel {

    private BookModel[] bookArray;
    private BooksView view;

    public BooksModel(int booksQuantity) {
        this.bookArray = new BookModel[booksQuantity];
        this.view = new BooksView();
    }

    public BooksModel(BookModel[] bookArray) {
        this.bookArray = bookArray;
        this.view = new BooksView();
    }

    public void addNewBook(BookModel bookModel){
        addToBooksArray(bookModel);
    }

    private void addToBooksArray(BookModel bookModel) {
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i] == null) {
                bookArray[i] = bookModel;
                break;
            }
        }
    }

    public void printAllBooks() {
        for (BookModel bookModel : bookArray) {
            if (bookModel != null)
            view.print(bookModel.toString());
        }
    }

    public void changePriceForAllBooksOnPercent(){
        int percent = InputUtility.inputPercentValueWithScanner(view);
        for (BookModel bookModel : bookArray) {
            if (bookModel != null) {
                double price = bookModel.getPrice();
                price = price + (price * percent / 100);
                bookModel.setPrice(price);
            }
        }
    }

    public BooksModel getBooksByAuthor() {
        String author = InputUtility.inputBooksAuthorWithScanner(view);
        int count = 0;
        for (BookModel bookModel : bookArray) {
            if (bookModel == null) continue;
            if (bookModel.getAuthor().equalsIgnoreCase(author)) {
                count++;
            }
        }
        BookModel[] result = new BookModel[count];
        count = 0;
        for (BookModel bookModel : bookArray) {
            if (bookModel != null)
                if (bookModel.getAuthor().equalsIgnoreCase(author)) {
                    result[count++] = bookModel;
                }
        }
        return new BooksModel(result);
    }
    public BooksModel getBooksYoungerThenYear() {
        int yearOfPublishing = InputUtility.inputBookYearWithScanner(view);
        int count = 0;
        for (BookModel bookModel : bookArray) {
            if (bookModel == null) continue;
            if (bookModel.getYearOfPublishing() > yearOfPublishing) {
                count++;
            }
        }
        BookModel[] result = new BookModel[count];
        count = 0;
        for (BookModel bookModel : bookArray) {
            if (bookModel == null) continue;
            if (bookModel.getYearOfPublishing() > yearOfPublishing) {
                result[count++] = bookModel;
            }
        }
        return new BooksModel(result);
    }

    public void printBooksSortedByAuthor() {
        BookModel[] result = getBookArrayWithoutNull(bookArray);
        Arrays.sort(result, new AuthorComparator());
        System.out.println("RESULT:");
        for (BookModel bookModel : result) {
            view.print(bookModel.toString());
        }
    }

    public void printBooksSortedByPublisher() {
        BookModel[] result = getBookArrayWithoutNull(bookArray);
        Arrays.sort(result, new PublisherComparator());
        System.out.println("RESULT:");
        for (BookModel bookModel : result) {
            view.print(bookModel.toString());
        }
    }

    public void printBooksSortedByPrice() {
        BookModel[] result = getBookArrayWithoutNull(bookArray);
        Arrays.sort(result, new PriceComparator());
        for (BookModel bookModel : result) {
            view.print(bookModel.toString());
        }
    }

    private BookModel[] getBookArrayWithoutNull(BookModel[] books) {
        int size = 0;
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i] != null) size++;
        }
        BookModel[] result = new BookModel[size];
        for (int i = 0; i < size; i++) {
            if (bookArray[i] == null) continue;
            result[i] = bookArray[i];
        }
        return result;
    }


}
