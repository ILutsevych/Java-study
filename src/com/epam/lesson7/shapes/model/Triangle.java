package com.epam.lesson7.shapes.model;

public class Triangle extends Shape {
    private int a;
    private int b;
    private int c;

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString( ) {
        return "class = " + getClass().getName() +
                " : Color = " + this.color +
                " : a = " + this.a +
                " : b = " + this.b +
                " : c = " + this.c;
    }

    @Override
    public double calcArea() {
        if (isTriangleReal()){
            double p = (a + b + c) / 2;
            return Math.sqrt( p * ( p - a ) * ( p - b ) * ( p - c ));
        }
        return -1;
    }

    private boolean isTriangleReal(){
        if (a + b > c && a + c > b && b + c > a) return true;
        return false;
    }
}
