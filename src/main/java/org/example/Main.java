package org.example;

import org.example.figure.Circle;
import org.example.figure.Figure;
import org.example.figure.Rectangle;
import org.example.figure.Triangle;

public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle(8);
        System.out.printf("Периметр круга= %s \nПлощадь круга= %s%n",
                circle.getPerimeter(),
                circle.getSquare()
        );

        Figure rectangle = new Rectangle(5, 2);
        System.out.printf("Периметр прямоугольника= %s \nПлощадь прямоугольника= %s%n",
                rectangle.getPerimeter(),
                rectangle.getSquare()
        );

        Figure triangle = new Triangle(5, 5, 5);
        System.out.printf("Периметр треугольника= %s \nПлощадь треугольника= %s%n",
                triangle.getPerimeter(),
                triangle.getSquare()
        );
    }
}