package bookpackext;

import qpack.*;

public class IQDemo {
    public static void main(String args[]) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        ICharQ iQ;

        char ch;
        int i;

        iQ = q1;

        //поместить ряд символов в очередь фиксированного размера
        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

        //Отобразить содержимое очереди
        System.out.print("Содержимое фиксированной очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q2;

        //поместить ряд символов в динамическую очередь
        for (i = 0; i < 10; i++)
            iQ.put((char) ('Z' - i));

        //Отобразить содержимое очереди
        System.out.print("Содержимое динамической очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q3;

        //поместить ряд символов в кольцевую очередь
        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

        //Отобразить содержимое очереди
        System.out.print("Содержимое кольцевой очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        //поместить больше символов в кольцевую очередь
        for (i = 10; i < 20; i++)
            iQ.put((char) ('A' + i));

        iQ.reset();

        //Отобразить содержимое очереди
        System.out.print("Содержимое кольцевой очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println("\nСохранение и использование данных кольцевой очереди");

        //поместить символы в кольцевую очередь и извлечь их оттуда
        for (i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }
    }
}