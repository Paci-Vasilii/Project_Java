package com.company;

public class EXcDemo1 {
    public static void main(String args[]) {
        int nums[] = new int[4];

     try {
         System.out.println("До генерации исключения");

       nums[7] = 10;
         System.out.println("Эта строка не будет отображаться");
     }

     catch (ArrayIndexOutOfBoundsException ext) {
         System.out.println("Выход за границы массива!");
     }
     System.out.println("После оператора catch");
 }
}
