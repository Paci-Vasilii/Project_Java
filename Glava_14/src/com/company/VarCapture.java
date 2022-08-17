package com.company;

interface MyFunc {
    int func(int n);
}

public class VarCapture {
    public static void main(String args[]) {

        int num = 10;

        MyFunc myLambda = (n) -> {

            int v = num + n;

         // num++    // Не корректно, поскольку инструкция изменяе тзначение
                        // переменной num

            return v;
        };

        System.out.println(myLambda.func(8));

      //  num = 9;      // Ошибка, строка лишает num статуса финальной переменной
    }
}
