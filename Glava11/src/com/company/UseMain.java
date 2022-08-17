package com.company;

public class UseMain {
        public static void main(String args[]) {
           Thread thrd;

           //  Получить основной поток
           thrd = Thread.currentThread();

           //Отобралить имя основного потока
           System.out.println("Имя основного потока: " + thrd.getName());

           //Отобразить приоритет основного потока
           System.out.println("Приоритет: " + thrd.getPriority());

           System.out.println();

           //Установить имя и приоритет основного потокa
           System.out.println("Установка имиени и приоритета\n");
           thrd.setName("Thread #1");
           thrd.setPriority(Thread.NORM_PRIORITY+3);

           System.out.println("Новое имя основного потока: " +
                                thrd.getName());

           System.out.println("Новое значение приоритета: " +
                                thrd.getPriority());

        }
}
