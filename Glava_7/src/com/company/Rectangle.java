package com.company;

public class Rectangle extends TwoDShape {

    Rectangle(double w, double h) {
        super(w, h, "прямоугольник"); // вызвать конструктор суперкласса

    }

    Rectangle(double x) {
        super(x,"прямоугольник");
    }

    Rectangle(Rectangle ob) {
        super(ob);
    }

    String isSquare() {

        String a = "да";
        String b = "нет";

        if(getWidth() == getHeight()) return a;
        return b;
    }

    double area() {
        return getWidth() * getHeight();
    }
}
