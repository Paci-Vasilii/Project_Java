package com.company;

public class UpCase {
    public static void main(String args[]) {
        char ch;

        for(int i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch);

            // В следующем операторе сбрасывается 6 бит
            // после этого в переменной ch будет храниться код
            //символа прописной буквы
            ch = (char) ((int) ch & 65503);

            System.out.print(ch + " ");
        }
    }
}
