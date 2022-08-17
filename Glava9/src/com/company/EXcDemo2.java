package com.company;

public class EXcDemo2 {
    public static void main(String args[]) {

        try {
            ExcTest.genException();
        }
        //А здесь исключение перехватывается
        catch (ArrayIndexOutOfBoundsException ext) {
            System.out.println("Выход за границы массива!");
        }
        System.out.println("После оператора catch");
    }
}
