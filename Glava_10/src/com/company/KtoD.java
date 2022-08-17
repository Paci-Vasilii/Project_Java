package com.company;
import java.io.*;

public class KtoD {
    public static void main(String args[]) {
        String str;

        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(System.in));
        System.out.println("Признак конца ввода - строка 'stop' ");

        try(FileWriter fw = new FileWriter("test1.txt"))
        {
            do {
                System.out.println(": ");
                str = br.readLine();

                if(str.compareTo("stop") == 0) break;

                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
