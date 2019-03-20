package com.epam.lesson7.shapes;

import com.epam.lesson7.shapes.controller.Controller;
import com.epam.lesson7.shapes.model.Circle;
import com.epam.lesson7.shapes.model.Rectangle;
import com.epam.lesson7.shapes.model.Shape;
import com.epam.lesson7.shapes.model.Triangle;

public class Main {

    public static void main(String[] args) {

        Shape[] figures = new Shape[9];

        figures[0] = new Rectangle("Blue", 2, 3);
        figures[1] = new Rectangle("Red", 4, 2);
        figures[2] = new Rectangle("Black", 5, 4);
        figures[3] = new Rectangle("Blue", 6, 1);
        figures[4] = new Circle("White", 6);
        figures[5] = new Circle("Blue", 8);
        figures[6] = new Circle("Red", 5);
        figures[7] = new Triangle("Green", 6, 6, 6);
        figures[8] = new Triangle("Blue", 5, 6, 7);

        Controller controller = new Controller();
//        controller.toPrintShapeInfo(figures);
//        controller.calcArray(figures);
//        controller.countingAllShapesAreas(figures);
//        controller.makigArrayFromShapesAreas(figures);
        controller.calculateShapeArea(new Triangle("Blue", 5, 6, 7));

    }
}

