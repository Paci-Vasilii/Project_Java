package com.company;

public class Exercise10 {
    public static void main (String args []) {
        double дюймы,метры;
        int счетчик;

        счетчик = 0;

        for(дюймы = 1; дюймы < 100; дюймы++) {
            метры = дюймы * 0.0254;
            System.out.println(дюймы +" дюймов равняется  "+ метры +" метров ");

            счетчик++;
            if (счетчик == 12) {
                System.out.println();
                счетчик = 0;
            }
        }

    }
}
