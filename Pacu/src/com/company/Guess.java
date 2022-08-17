package com.company;

public class Guess {
    public static void main (String args[])
        throws java.io.IOException {
        char ch, answer = 'S';

        System.out.println("Задумана буква в диапазоне от A-Z.");
        System.out.println("Попытайтесь её угадать: ");

        ch = (char) System.in.read();// прочитать символ с клавиатуры

        if (ch == answer) System.out.println("**Правильно!**");

    }
}
