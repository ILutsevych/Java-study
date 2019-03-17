package com.epam.lesson6;

public class BooksApplication {

    public static void main(String[] args) {
        Books books = initializeBooks();
        books.printAllBooks();

        books.addNewBookFromConsole();
        System.out.println("Updated list of books:");
        books.printAllBooks();

        books.changePriceForAllBooksOnPercent();
        System.out.println("Updated list of books:");
        books.printAllBooks();

        Books booksByAuthor = books.getBooksByAuthor();
        System.out.println("List of books by author:");
        booksByAuthor.printAllBooks();

        Books booksYoungerThenYear = books.getBooksYoungerThenYear();
        System.out.println("List of books younger then year:");
        booksYoungerThenYear.printAllBooks();

    }

    private static Books initializeBooks() {
        int booksQuantity = 10;
        Books books = new Books(booksQuantity);
        books.addNewBook(new Book(1, "Book1", "Author1","PNGT", 2001, 500, 100));
        books.addNewBook(new Book(2, "Book2", "Author2","PNGT", 2005, 500, 100));
        books.addNewBook(new Book(3, "Book3", "Author1","PNGT", 2009, 500, 100));
        books.addNewBook(new Book(4, "Book4", "Author3","PNGT", 2005, 500, 100));
        books.addNewBook(new Book(5, "Book5", "Author4","PNGT", 2009, 500, 100));
        books.addNewBook(new Book(6, "Book6", "Author3","PNGT", 2005, 500, 100));
        books.addNewBook(new Book(7, "Book7", "Author5","PNGT", 2009, 500, 100));
        return books;
    }
}
