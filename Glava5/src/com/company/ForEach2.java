package com.company;

public class ForEach2 {
    public static void main(String args[]) {
        int nums[][] = new int[3][5] ;
        int sum = 0;

        // ввести ряд значений в массив nums
        for (int i = 0; i < 3; i++)
            for(int j = 0; j < 5; j++)
                nums[i][j] = (i + 1) * (j + 1);

        //использовать разновидность for-each цикла for
        //для суммирования и отображения значений.
        //обратите внимание на объявление переменной х.

        for( int x[]: nums) {
            for(int y : x) {
                System.out.println("Значение: " + y);
                sum += y;
            }
        }
        System.out.println("Сумма: " + sum);
    }
}
