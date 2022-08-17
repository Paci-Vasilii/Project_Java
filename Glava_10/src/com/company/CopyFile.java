package com.company;
import java.io.*;

public class CopyFile {
    public static void main(String args[]) throws IOException {
        int i;

        //Прежде всего нужно убедиться в том, что программе передаются имена
        // обоих файлов

        if(args.length != 2) {
            System.out.println("Использование: CopyFile откуда куда");
            return;
        }

        // Открытие двух файлов и управление ими с помощью оператора try
        try (FileInputStream fin = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1]))
            {
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);

        } catch (IOException exc) {
                System.out.println("Ошибка ввода-вывода" + exc);
            }
        }
    }

