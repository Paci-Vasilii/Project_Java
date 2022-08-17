package com.company;

public class Help {
    public static void main (String args[])
    throws java.io.IOException {
       char choice;

       System.out.println("Справка:\n1. if\n2. switch\nВыберите:");

       choice = (char) System.in.read();

       switch (choice) {
           case '1':
               System.out.println("Оператор if:\n");
               System.out.println("if(условие) оператор;");
               System.out.println("else оператор;");
               break;
           case '2':
               System.out.println("Оператор switch:\n");
               System.out.println("switch(выражение) {");
               System.out.println("case константа:");
               System.out.println("последовательность операторов");
               System.out.println("break; ");
               System.out.println("}");
               break;
           default:
               System.out.println("Запрос не найден.");
       }

    }
}
