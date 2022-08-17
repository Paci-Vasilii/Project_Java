package com.company;

public class UseThrowableMethods {
    public static void main(String args[]) {

        try {
            ExcTest.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            // перехватить исключение
            System.out.println("Стандартное сообщение: ");
            System.out.println(exc);
            System.out.println("\nСтек вызовов: ");
            exc.printStackTrace();
        }
       System.out.println("После оператора catch"); // почему-то выводится до, а не после!!
    }
}
