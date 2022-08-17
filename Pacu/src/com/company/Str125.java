package com.company;

public class Str125 {
    public static void main(String args[])
            throws java.io.IOException {
        char ch,ignore;
        int x;

        x = 0;

        System.out.println("Введите символы с клавиатуры (. - выход!)");

        for(;;){
        do {

            ch = (char) System.in.read();

            if(ch == ' ') x ++;


        } while (ch != '.');
            if (ch == '.') break;
        }
        System.out.println("число пробелов равно: " + x);
    }
}