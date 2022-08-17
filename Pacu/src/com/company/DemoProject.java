package com.company;

public class DemoProject {
    public static void main (String args[]) {
       char ch1, ch2;
       ch1 = 'A';
       ch2 = 'G';

     switch (ch1) {
         case 'A': System.out.
                   println("Это разде А внешнего оператора switch");
       switch (ch2) {
           case 'A': System.out.
                     println("Это разде А внутреннего оператора switch");
           break;
           }
          break;
       }
    }
}
