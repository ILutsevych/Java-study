package com.epam.lesson7.shapes.model;

public class Circle extends Shape {

    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(){

    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "class = " + getClass().getName() + " : Color = " + this.color + " : Radius = " + this.radius;
    }

    public double calcArea(){
        return Math.PI * radius * radius;
    }
}
