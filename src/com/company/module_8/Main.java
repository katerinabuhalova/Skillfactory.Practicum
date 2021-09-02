package com.company.module_8;

public class Main {
    public static void main(String[] args) {
        Figure triangle = new Triangle(3, 5, 5, 40);
        Figure rectangle = new Rectangle(4, 6, 5);
        Figure circle = new Circle(5);

        circle.printInfoFigure();
        rectangle.printInfoFigure();
        triangle.printInfoFigure();
    }
}