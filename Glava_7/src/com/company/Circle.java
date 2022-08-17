package com.company;

public class Circle extends TwoDShape {
    private double radius;
    private double Pi = 3.14;
    private String style;

    Circle() {
        super(); // вызвать конструктор класса по умолчанию
        style = "none";
    }

    //Конструктор
    Circle(String s, double w, double h) {
        super(w, h, "треугольник"); // вызвать конструктор суперкласса

        style = s;
    }

    //Конструктор с одним аргументом
    Circle(double x) {
        super(x,"треугольник"); // вызвать конструктор суперкласса с одним аргументом

        style = "закрашенный";
    }

    // Создать один обьект на основе другого
    Circle(Triangle ob) {
        super(ob);
    }


    Circle(double r, String s) {
        radius = r;
        style = s;
    }


    double area() {
       return Pi * (radius * radius);
    }

    void showStyle() {
        System.out.println("Круг - " + style);
    }
}
