package com.epam.lesson7.shapes.controller;

import com.epam.lesson7.shapes.model.Circle;
import com.epam.lesson7.shapes.model.Rectangle;
import com.epam.lesson7.shapes.model.Shape;
import com.epam.lesson7.shapes.model.Triangle;
import com.epam.lesson7.shapes.view.ShapesView;

import static com.epam.lesson7.shapes.utils.ArrayUtils.printArray;

public class Controller {
        private Circle circle;
        private Rectangle rectangle;
        private Triangle triangle;
        private ShapesView shapesView;

        public Controller() {
            this.shapesView = new ShapesView();
        }

        public void calcArray(Shape[] figures) {
            for (Shape element : figures) {
                shapesView.printShapeTypeWithArea(element);
            }
        }

        public void toPrintShapeInfo(Shape[] figures) {
            for (Shape element : figures) {
                String info = element.toString();
                shapesView.printMessage(info);
            }
        }

        public double countingAllShapesAreas(Shape[] figures) {
            double allAreas = 0;
            for (Shape element : figures) {
                allAreas += element.calcArea();
            }
            shapesView.printMessageAndValue(ShapesView.ALL_SHAPES_AREAS_ARE, allAreas);
            return allAreas;
        }

        public double[] makigArrayFromShapesAreas(Shape[] figures) {
            double[] array = new double[3];
            for (int i = 0; i < figures.length; i++) {
                if (figures[i] instanceof Triangle) {
                    array[0] += figures[i].calcArea();
                } else if (figures[i] instanceof Circle) {
                    array[1] += figures[i].calcArea();
                } else if (figures[i] instanceof Rectangle) {
                    array[2] += figures[i].calcArea();
                }
            }
            printArray(array);
            return array;
        }

        public double calculateShapeArea(Shape shape) {
            double result = shape.calcArea();
            if (result == -1) {
                shapesView.printShapeErrorMessage(shape);
                return 0.0;
            }
            shapesView.printMessageAndValue("Area is", result);
            return result;
        }
    }