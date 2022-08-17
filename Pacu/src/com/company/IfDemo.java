package com.company;

public class IfDemo {
    public static void main(String args[]) {
        int a,b,c;
        a = 2;
        b = 3;

        if (a < b) System.out.println("а меньше b");
        //слудующая строка никогда не может быть выведена
        if (a==b) System.out.println("Вы не должны увидеть этот текст");

        System.out.println();

        c = a - b; //переменная "c" содержит значение -1

        System.out.println("c содержит -1");
        if (c >= 0) System.out.println("c - не отрицательное число");
        if (c < 0) System.out.println("c - отрицательное число");

        System.out.println();

        c = b - a;//Переменна с теперь содержит значение 1

        System.out.println("c содержит 1");
        if (c >= 0) System.out.println("c - не отрицательное число");
        if (c < 0) System.out.println("c - отрицательное число");
    }
}
