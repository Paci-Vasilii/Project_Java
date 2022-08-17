package com.company;

public interface SomeTest<T> {
    boolean test(T n, T m);
}

class GenericFunctionalInterfaceDemo {
    public static void main(String args[]) {

        SomeTest<Integer> isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.test(10,2))
            System.out.println("2 является делителем 10");

        SomeTest<Double> isFactorD = (n, d) -> (n % d) == 0;

        if (isFactorD.test(212.0,4.0))
            System.out.println("4.0 является делителем 212");

        SomeTest<String> isIn = (a, b) -> a.indexOf(b) != -1;

        String str = "Обобщенный функциональный интерфейс";

        System.out.println("Тестируемая строка: " + str);

        if (isIn.test(str,"face"))
            System.out.print("'face' найдено");
        else
            System.out.print("'face' не найдено");

    }
}
