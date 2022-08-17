package com.company;

public class StringDemo {
    public static void main(String args[]) {
        //различные способы обьявления строк
        String str1 = new String("В Java строки - обьекты.");
        String str2 = "Их можно создавать разными способами.";
        String str3 = new String(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }
}
