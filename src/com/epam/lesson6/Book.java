package com.epam.lesson6;

public class Book {

    private int id;
    private String name;
    private String author;
    private String publisher;
    private int yearOfPublishing;
    private int pagesAmount;
    private double price;

    public Book(int id, String name, String author, String publisher,
                int yearOfPublishing, int pagesAmount, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.pagesAmount = pagesAmount;
        this.price = price;
    }

    public int getId( ) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName( ) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor( ) {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher( ) {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublishing( ) {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getPagesAmount( ) {
        return pagesAmount;
    }

    public void setPagesAmount(int pagesAmount) {
        this.pagesAmount = pagesAmount;
    }

    public double getPrice( ) {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void view(){
        System.out.println(
                        "\nID = " + id +
                        "\nName = " + name +
                        "\nAuthor = " + author +
                        "\nPublisher = " + publisher +
                        "\nYear of publishing = " + yearOfPublishing +
                        "\nPage amount = " + pagesAmount +
                        "\nPrice = " + price);
    }
}

