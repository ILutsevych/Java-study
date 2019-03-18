package com.epam.lesson6;

import java.util.Scanner;

public class Books {

    private Book[] books;


    public Books(int booksQuantity) {
        this.books = new Book[booksQuantity];
    }

    public Books(Book[] books) {
        this.books = books;
    }

    public void addNewBookFromConsole(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book ID--> ");
        int id = sc.nextInt();
        System.out.println("Enter book Name--> ");
        String name = sc.next();
        System.out.println("Enter book Author--> ");
        String author = sc.next();
        System.out.println("Enter book Publisher--> ");
        String publisher = sc.next();
        System.out.println("Enter year of book publishing--> ");
        int yearOfPublishing = sc.nextInt();
        System.out.println("Enter book page amount--> ");
        int pagesAmount = sc.nextInt();
        System.out.println("Enter book price--> ");
        double price = sc.nextDouble();
        sc.close();
        Book book = new Book(id, name, author, publisher, yearOfPublishing, pagesAmount, price);
        addNewBook(book);
    }

    public void addNewBook(Book book){
        addToBooksArray(book);
    }

    public void printAllBooks() {
        for (Book book : books) {
            if (book != null)
                book.view();
        }
    }

    public void changePriceForAllBooksOnPercent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount of percent-->");
        int percent = sc.nextInt();
        sc.close();
        for (Book book : books) {
            if (book != null) {
                double price = book.getPrice();
                price = price + (price * percent / 100);
                book.setPrice(price);
            }
        }
    }

    public Books getBooksByAuthor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book's author-->");
        String author = sc.next();
        sc.close();
        int count = 0;
        for (Book book : books) {
            if (book == null) continue;
            if (book.getAuthor().equalsIgnoreCase(author)) {
                count++;
            }
        }
        Book[] result = new Book[count];
        count = 0;
        for (Book book : books) {
            if (book != null)
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result[count++] = book;
            }
        }
        return new Books(result);
    }

    public Books getBooksYoungerThenYear() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year-->");
        int yearOfPublishing = sc.nextInt();
        sc.close();
        int count = 0;
        for (Book book : books) {
            if (book == null) continue;
            if (book.getYearOfPublishing() > yearOfPublishing) {
                count++;
            }
        }
        Book[] result = new Book[count];
        count = 0;
        for (Book book : books) {
            if (book == null) continue;
            if (book.getYearOfPublishing() > yearOfPublishing) {
                result[count++] = book;
            }
        }
        return new Books(result);
    }

    private void addToBooksArray(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }
}
