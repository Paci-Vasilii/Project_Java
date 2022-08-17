package com.company;

public class Lambda_7 {
    public static void main(String args[]) {

        MyFuck<Integer> f = (count) -> {

            int result = 1;

                for(int i=1; i <= count; i++) result *= i;
                return result;
        };

        System.out.println(f.func(3));
    }
}
