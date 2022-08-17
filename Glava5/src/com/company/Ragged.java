package com.company;

public class Ragged {
    public static void main(String args[]) {
        int ridders[][] = new int[7][];
        ridders[0] = new int[10];
        ridders[1] = new int[10];
        ridders[2] = new int[10];
        ridders[3] = new int[10];
        ridders[4] = new int[10];
        ridders[5] = new int[2];
        ridders[6] = new int[2];

        int i, j;

        // сформировать произвольные данные

        for(i = 0; i < 5; i++)
            for(j = 0; j < 10; j++)
                ridders[i][j] = i + j + 10;
        for(i = 5; i < 7; i++)
            for(j = 0; j < 2; j++)
                ridders[i][j] = i + j + 10;

        System.out.println("Количество пассажиров, перевезенных каждым рейсом, в будние дни недели:");

        for(i = 0; i < 5; i++) {
            for(j = 0; j < 10; j++)
                System.out.print(ridders[i][j] + " ");
            System.out.println();
        }
        System.out.println();

        System.out.println("Количество пассажиров, перевезенных каждым рейсом, в выходные дни недели:");

        for(i = 5; i < 7; i++) {
            for (j = 0; j < 2; j++)
                System.out.print(ridders[i][j] + " ");
            System.out.println();
        }
    }
}
