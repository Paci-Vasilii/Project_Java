package com.company;

public class ScopeDemo {
    public static void main (String args[]) {
        int x;

        x = 10;
        if(x==10) {

            int y = 20;

            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; // Ошибка!!! В этом месте переменная y недоступна!
        // а переменная х по прежнему доступна!
        System.out.println("x is " + x);
    }
}
