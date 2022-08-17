package com.company;

public class SupSubRef {
    public static void main(String args[]) {
        X x = new X(10);
        X x2;
        Y y = new Y(5, 7);
        Y y2;

        x2 = x; // Допустимо, так как обе переменные одного типа
        System.out.println("x2.a: " + x2.a);

        // Класс Y является подклассом X, поэтому переменные x2 и y
        // могут ссылаться на один и тот же обьект производного класса
        x2 = y; // По-прежнему допустимо по указанной выше причине
        System.out.println("x2.a: " + x2.a);

        // В классе X известны только члены класса X
        x2.a = 19; // допустимо

        System.out.println("x2.a: " + x2.a);

        // x2.b = 27; // ошибка так как пременная b не является членом класса X

        y2 = y;

        y2.a = 27;
        y2.b = 10;
        System.out.println("y2.a: " + y2.a);
        System.out.println("y2.b: " + y2.b);
    }
}