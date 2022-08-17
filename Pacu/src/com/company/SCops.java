package com.company;

public class SCops {
    public static void main (String args[]) {
        int n, d, q;

        n = 10;
        d = 2;
        if(d != 0 && (n % d) == 0) // d не равен 0 и n делится на d без остатка, то он является делителем

            System.out.println(d + " является делителем " +n);
        d = 0;

        // Второй операнд не вычисляется так как d равен 0
        if(d != 0 && (n % d) == 0)
            System.out.println(d + "является делителем " +n);


    }
}
