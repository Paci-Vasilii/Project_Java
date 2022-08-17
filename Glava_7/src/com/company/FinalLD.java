package com.company;

public class FinalLD {
    public static void main(String args[]) {
        ErrorMsg err = new ErrorMsg();

        // При вызове метода используются константы,
        // Объявленные с помощью ключевого слова final
        System.out.println(err.getErrorMsg(err.OUNTER));
        System.out.println(err.getErrorMsg(err.DISKERR));
        System.out.println(err.getErrorMsg(4));
    }
}
