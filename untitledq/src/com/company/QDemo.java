package com.company;

public class QDemo {
    public static void main(String args[]) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        int ch;
        int i;

        System.out.println("Использование очереди bigQ для сохранения чисел");

        //поместить буквенные символы в очередь bigQ
        for(i = 0; i < 26; i++)
            bigQ.put((1 + i));

        //извлечь буквенные символы из очереди bigQ и отобразить
        System.out.print("Cодержимое очереди bigQ: ");
        for(i = 0; i < 26; i++) {
            ch = bigQ.get();
            if(ch != 0) System.out.print(ch + " ");
        }

        System.out.println("\n");

        System.out.println("Использование очереди smallQ для генерации ошибок");

        //использовать очередь smallQ для генерации ошибок

        for(i = 0; i < 5; i++) {
            System.out.print("Попытка сохранения " + (26 - i));
            smallQ.put ((26 - i));

            System.out.println();
        }

        //Дополнительные ошибки при обращении к очереди smallQ
        System.out.print("Содержимое smallQ: ");
        for(i = 0; i < 5; i++) {
            ch = smallQ.get();
            if(ch != 0) System.out.print(ch + " ");
        }
    }
}
