package com.company;

public class StrOps {
    public static void main(String args[]) {
        String str1 = "Java - не лидер Интернета!";
        String str2 = new String(str1);
        String str3 = "Java - лидер Интернета!";
        int result, idx;
        char ch;

        System.out.println("Длинна str1: " + str1.length());
        System.out.println("Длинна str3: " + str3.length());

        System.out.println("Вывести на экран 3 символ строки str3: "+ str3.charAt(3));



        //отобразить строку str1 посимвольно
        for(int i = 0; i < str1.length(); i++)
            System.out.print(str1.charAt(i));
        System.out.println();

        if(str1.equals(str2))
            System.out.println("str1 эквивалента str2");
        else
            System.out.println("str1 не эквивалента str2");

        if(str1.equals(str3))
            System.out.println("str1 эквивалента str3");
        else
            System.out.println("str1 не эквивалента str3");
        result = str1.compareTo(str3);
        if(result == 0)
        System.out.println("str1 и str3 равны");
        else if(result < 0)
            System.out.println("str1 меньше str3");
        else
            System.out.println("str1 больше str3");

        //присвоить переменной str2 новую строку
        str2 = "One Two Three One ";

        idx = str2.indexOf("One");
        System.out.println("Индекс первого вхождения One: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Индекс последнего вхождения One: " + idx);

    }
}
