package com.company;

public class ShapesTest {
    public static void main(String args[]) {
        Circle cl1 = new Circle(34, "крутой");

        System.out.println("Информация о cl1: ");
        cl1.showStyle();
        System.out.println("Площадь круга = " + cl1.area() + " см/кв");


    }
}
