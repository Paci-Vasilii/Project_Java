package com.company;

// Подкласс для представления треугольников
// производный от класса TwoDShape

public class Triangle extends TwoDShape {
    private String style;

    //Конструктор по умолчанию
    Triangle() {
        super(); // вызвать конструктор класса по умолчанию
        style = "none";
    }

    //Конструктор
    Triangle(String s, double w, double h) {
        super(w, h, "треугольник"); // вызвать конструктор суперкласса

        style = s;
    }

    //Конструктор с одним аргументом
    Triangle(double x) {
        super(x,"треугольник"); // вызвать конструктор суперкласса с одним аргументом

        style = "закрашенный";
    }

    // Создать один обьект на основе другого
    Triangle(Triangle ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
