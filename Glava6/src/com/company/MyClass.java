package com.company;

public class MyClass {
    private int alpha; //закртый доступ
    public int beta;   //открытый доступ
    int gamma; // тип доступа по умолчанию, по сути (public)

    void setAlpha(int a){
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}
