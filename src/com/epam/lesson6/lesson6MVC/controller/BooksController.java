package com.epam.lesson6.lesson6MVC.controller;

import com.epam.lesson6.lesson6MVC.view.BooksView;
import com.epam.lesson6.lesson6MVC.model.BookModel;
import com.epam.lesson6.lesson6MVC.model.BooksModel;

import java.util.Scanner;

public class BooksController {

    private BooksView booksView = new BooksView();
    private BooksModel booksModel;

    public BooksController() {
        initializeBooks();
    }

    public void run(){
        printMenu();
        runExecutor();
    }

    private BooksModel initializeBooks() {
        int booksQuantity = 10;
        booksModel = new BooksModel(booksQuantity);
        booksModel.addNewBook(new BookModel(1, "Book1", "Author1","APNGT", 2001, 500, 100));
        booksModel.addNewBook(new BookModel(2, "Book2", "Author2","BPNGT", 2005, 500, 200));
        booksModel.addNewBook(new BookModel(3, "Book3", "Author1","CPNGT", 2009, 500, 2200));
        booksModel.addNewBook(new BookModel(4, "Book4", "Author3","FPNGT", 2005, 500, 2250));
        booksModel.addNewBook(new BookModel(5, "Book5", "Buthor4","APNGT", 2009, 500, 5800));
        booksModel.addNewBook(new BookModel(6, "Book6", "Duthor3","FPNGT", 2005, 500, 100));
        booksModel.addNewBook(new BookModel(7, "Book7", "Cuthor5","TPNGT", 2009, 500, 550));
        return booksModel;
    }

    private void printMenu() {
        booksView.print("**********BOOKS LIBRARY**********");
        booksView.print("Choose option:");
        booksView.print("1 - exit");
        booksView.print("2 - print all books");
        booksView.print("3 - change price for books");
        booksView.print("4 - get books by author");
        booksView.print("5 - get books by year of publishing");
        booksView.print("6 - get books sorted by author");
        booksView.print("7 - get books sorted by publisher");
        booksView.print("8 - get books sorted by price");
        booksView.print("Enter option number ->");
    }

    private void runExecutor() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int command = sc.nextInt();
            switch (command) {
                case 1: {
                    return;
                }
                case 2: {
                    booksModel.printAllBooks();
                    break;
                }
                case 3: {
                    booksModel.changePriceForAllBooksOnPercent();
                    booksView.print("Updated list of books:");
                    booksModel.printAllBooks();
                    break;
                }
                case 4: {
                    BooksModel booksByAuthor = booksModel.getBooksByAuthor();
                    booksView.print("List of books by author:");
                    booksByAuthor.printAllBooks();
                    break;
                }
                case 5: {
                    BooksModel booksYoungerThenYear = booksModel.getBooksYoungerThenYear();
                    booksView.print("List of books younger then year:");
                    booksYoungerThenYear.printAllBooks();
                    break;
                }
                case 6: {
                    booksModel.printBooksSortedByAuthor();
                    break;
                }
                case 7: {
                    booksModel.printBooksSortedByPublisher();
                    break;
                }
                case 8: {
                    booksModel.printBooksSortedByPrice();
                    break;
                }
                default: {
                    System.out.println("Enter number of the menu option.");
                    break;
                }
            }
        }
    }
}
