package com.company;

public class GenIFDemo {
    public static void main(String args[]) {
        Integer x[] = { 1, 2, 3 };

        MyClass<Integer> ob = new MyClass<Integer>(x);

        if (ob.contains(2))
            System.out.println("2 содержится в ob");
        else
            System.out.println("2 НE содержиться в ob");

        if (ob.contains(5))
            System.out.println("5 содержится в ob");
        else
            System.out.println("5 НE содержиться в ob");

      // Следующие строки кода недопустимы, так как объект оЬ
      // является вариантом реализации интерфейса Containment для
      // типа Integer, а значение 9.25 относится к типу DouЫe.
        // if(ob.contains(9.25)) // Недопустимо!
        // System.out.println("9.25 не содержится в оЬ");
    }
}
