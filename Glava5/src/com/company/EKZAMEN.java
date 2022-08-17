package com.company;

public class EKZAMEN {
    public static void main(String args[]) {
        double result;
        double sum = 0;
        double add = 0;
        double counter[] = new double[10];
        counter[0] = 3.13;
        counter[1] = 2.13;
        counter[2] = 1.13;
        counter[3] = 33.13;
        counter[4] = 32.13;
        counter[5] = 31.13;
        counter[6] = 18.13;
        counter[7] = 24.13;
        counter[8] = 2.13;
        counter[9] = 1.13;

        for (int i = 0; i < 10; i++) {
           sum = sum + counter[i] ;
           add++;
        }
        result = sum / add;
        System.out.println(result);
    }
}