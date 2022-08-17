package com.company;
import java.io.*;

public class ReadLines {
    public static void main(String args[])
        throws IOException
    {
        // Создать обьект типа BufferedReader,
        // связанный с потоком System.in
        BufferedReader br = new
                BufferedReader(new
                InputStreamReader(System.in));

        String str;

        System.out.println("Введите текстовые строки");
        System.out.println("Признак конца ввода - строка 'stop' ");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }
}
