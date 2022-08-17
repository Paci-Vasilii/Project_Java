package com.company;

public class WildcardDemo {
    public static void main(String args[]) {

        NumereticFns<Integer> iOb = new NumereticFns<Integer>(6);
        NumereticFns<Double> dOb = new NumereticFns<Double>(-6.0);
        NumereticFns<Long> lOb = new NumereticFns<Long>(5L);

        System.out.println("Сравнение iOb и dOb.");
        if (iOb.absEqual(dOb))
            System.out.println("Абсолютные значения совпадают.");
        else
            System.out.println("Абсолютные значения отличаются.");

        System.out.println();

        System.out.println("Сравнение iOb и lOb.");
        if (iOb.absEqual(lOb))
            System.out.println("Абсолютные значения совпадают.");
        else
            System.out.println("Абсолютные значения отличаются.");

    }
}
