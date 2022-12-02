package com.company;

public class Constant {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3},
                         {1, 2, 3}};

        Test1 t1 = new Test1();

        System.out.println(t1.getSum(array));
    }
}

class Test1 {


    public int getSum(int a[][]) {

        int x = 0;
        int y = 0;

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j <= a.length; j++) {
                if(j == a.length ) {
                    x = a[i][j];
                }

                if(j == a.length - 1) {
                    y = x + a[i][j];
                }
            }
        }
            return y;
    }
}

