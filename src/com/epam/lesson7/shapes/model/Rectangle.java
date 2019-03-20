package com.epam.lesson7.shapes.model;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString( ) {
        return "class = " + getClass().getName() +
                " : Color = " + this.color +
                " : Width = " + this.width +
                " : Height = " + this.height;
    }
    @Override
    public double calcArea( ) {
        return width*height;
    }
}
