package com.company;

public class LambdaDemo {

    public static void main(String[] args) {


        Runnable runnable = () -> System.out.println("Hello");

        System.out.println("runnable");


    }
}