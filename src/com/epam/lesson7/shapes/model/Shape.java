package com.epam.lesson7.shapes.model;

public class Shape {

    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public String toString(){
       return "class = " + getClass().getName() + " : Color = " + this.color;
    }

    public Shape() {

    }

    public double calcArea() {
        System.out.println("Figure square is not definded ");
        return 0.0;
    }
}
