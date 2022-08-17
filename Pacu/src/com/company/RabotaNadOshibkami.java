package com.company;

public class RabotaNadOshibkami {
    public static void main (String args[]) {
        int i, j;
        boolean b;

        for(i = 2; i < 100; i++) {
            b = true;

            for (j = 2; j <= i / j; j++ ) {
                if ((i % j) == 0)
                    b = false;

            }
            if(b)
            System.out.println("Простым числом является: " + i );
        }


    }
}
