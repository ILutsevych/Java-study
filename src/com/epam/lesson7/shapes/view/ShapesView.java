package com.epam.lesson7.shapes.view;

import com.epam.lesson7.shapes.model.Shape;

public class ShapesView {
    public static final String SHAPE_IS_NOT_REAL = "Shape is not real ";
    public static final String AREA_IS = " area is : ";
    public static final String ALL_SHAPES_AREAS_ARE = "All shapes areas are: ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printShapeTypeWithArea(Shape shape){
        System.out.println(shape.getClass().getSimpleName() + AREA_IS + shape.calcArea());
    }

    public void printMessageAndValue(String message, double value){
        System.out.println(message + " " + value);
    }
    public void printShapeErrorMessage(Shape shape){
        System.out.println(SHAPE_IS_NOT_REAL);
    }
}
