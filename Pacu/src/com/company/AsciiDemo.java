package com.company;

public class AsciiDemo {
    public static void main (String args[])
        throws java.io.IOException {
        char ch;
        int abi, exit;

        abi = 0;

        System.out.print("Введите символы:");

        for(;;) {

            do {

                exit = (char) System.in.read();

                if (exit == 32) System.out.print(" ");
                if(exit >= 65 && exit <= 90) {

                    exit += 32;
                    ch = (char) exit;
                    System.out.print(ch);
                    abi++;
                }
                else if (exit >= 97 && exit <= 122) {

                    exit -= 32;
                    ch = (char) exit;
                    System.out.print(ch);
                    abi++;
                }

                if (exit == '.') break;

            } while (exit != '.');

            if (exit == '.') break;

        }
        System.out.println("\nЧисло символов: " + abi);
    }
}
