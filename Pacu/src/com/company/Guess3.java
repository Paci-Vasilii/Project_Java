package com.company;

public class Guess3 {
    public static void main (String args[])
    throws java.io.IOException {
        char ch, answer = 'S';

        System.out.println("Задана буква от A-Z");
        System.out.println("Попытайтесь её угадать:");

        ch = (char) System.in.read();

        if (ch == answer)
            System.out.println("**Правильно**");
        else {
            System.out.println("Извините, нужная буква находится: ");
            if (ch < answer)
                System.out.println("ближе к концу алфавита");
            else
                System.out.println("ближе к началу алфавита");

        }

    }
}
