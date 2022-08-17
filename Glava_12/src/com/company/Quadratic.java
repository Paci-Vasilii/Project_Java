package com.company;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.System.out;

public class Quadratic {
    public static void main(String args[]) {

        // a, b и c представляют коэфициенты

        double a, b, c, x;

        a = 4;
        b = 1;
        c = -3;

        // Найти первый корень
        x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        out.println("Перый корень: " + x);

        // Найти второй корень
        x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        out.println("Второй корень : " + x);

    }
}
