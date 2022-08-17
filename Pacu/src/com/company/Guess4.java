package com.company;

public class Guess4 {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, ignore, answer = 'S';

        do {
            System.out.println("Задана буква от A-Z");
            System.out.print("Попытайтесь её угадать:");

            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer)
                System.out.println("**Правильно**");
            else {
                System.out.println("Извините, нужная буква находится: ");
                if (ch < answer)
                    System.out.println("ближе к концу алфавита\n");
                else
                    System.out.println("ближе к началу алфавита\n");

            }
        } while (answer != ch);
    }
}