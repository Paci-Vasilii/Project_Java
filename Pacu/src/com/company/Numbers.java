package com.company;

public class Numbers {
    public static void main (String args[]) {
        int i, j;
        boolean isprime;

        for ( i = 2; i < 100; i++ ) {
            isprime = true;

            for ( j = 2; j <= i / j; j++ ) {
                System.out.println( i + " : " + j ); // вывод
                if ( ( i % j ) == 0 )
                    isprime = false;
            }

            if ( isprime )
                System.out.println( i + "-простое число" );
        }

    }
}