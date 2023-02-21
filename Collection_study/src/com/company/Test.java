package com.company;



public class Test {
    public static void main(String[] args) {
        double a[] = { 10.0, 5.0, 11.0, 12.0, 1.0, 2.0, 33.0};

        double min = a[0];
        double max = a[0];
        double avg = 0;

 //      for(int i = 0; i < a.length; i++ ) {
 //           a[i] = ;
//       }


       for(int i = 1; i < a.length; i++) {
           if(min > a[i]) min = a[i];
           if(max < a[i]) max = a[i];
           avg += a[i]/a.length;
       }




      //  for(double i : a)
     //   System.out.println(i + " ");

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.printf("Avg = %.2f ", avg);
    }
}
