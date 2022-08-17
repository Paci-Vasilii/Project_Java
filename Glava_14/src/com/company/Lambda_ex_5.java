package com.company;

interface Value {
    boolean getValue();
}



public class Lambda_ex_5 {
    public static void main(String args[]) {


            Value b = () -> {
                int x = 14;
                if (x >= 10 && x <= 20) return true;
                else
                    return false;
            };

        System.out.println(b.getValue());
    }
}
