package com.company;
import java.io.*;

// Справочная система, ипользующая дисковый файл для хранения информации


/*
    В классе Help открывается файл со справочной информацией,
    производится поиск указанной темы, а затем отображается
    справочная информация. Обратите внимание на то, что данный
    класс обрабатывает все исключения, освобождая от этого
    вызывающий код.
*/

public class Help {
    String helpfile; // имя файла содержащего справочную информацию

    Help(String fname) {
        helpfile = fname;
    }

    boolean helpon(String what) {
        int ch;
        String topic, info;

        //Открыть справочный файл
        try(BufferedReader helpRdr =
                new BufferedReader(new FileReader(helpfile)))
        {
            do {
                // Читать символы до тех пор пока не встретится символ #
                ch = helpRdr.read();

                //Проверить совпадают ли темы
                if(ch == '#') {
                    topic = helpRdr.readLine();
                    if(what.compareTo(topic) == 0) { // найти тему
                        do {
                            info = helpRdr.readLine();
                            if(info != null) System.out.println(info);
                        } while ((info != null) &&
                                (info.compareTo("") != 0));
                        return true;
                        }
                }
            } while (ch != -1);
        }
        catch (IOException exc) {
            System.out.println("Ошибка при попытке доступа к файлу справки");
            return false;
        }
        return false; // тема не найдена
    }

    // Получить тему справки
    String getSelection() {
        String topic = "";

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Укажите тему: ");
        try {
            topic = br.readLine();
        }
        catch (IOException exc) {
            System.out.println("Ошибка при чтении с консоли");
        }
        return topic;
    }
}
