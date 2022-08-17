package com.company;

public class RethrowDemo {
    public static void main(String args[]) {
        try {
            Rethrow.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            //повторно перехватить исключение
            System.out.println("Фатальная ошибка - " + "выполнение программы прервано!");
        }
    }
}
