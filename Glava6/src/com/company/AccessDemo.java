package com.company;

public class AccessDemo {
    public static void main(String args[]) {
        MyClass ob = new MyClass();

        //доступ к переменной alpha доступен только с помощью предназначенных для этих целей методов

        ob.setAlpha(-99);
        System.out.println("ob.alpha: " + ob.getAlpha() );

        //обратиться к переменной alpha так, как показанно ниже нельзя!
        // ob.alpha = 10;  // Ошибка, alpha - закрытая переменная

        //Следующие обращения вполне допустимы, так как
        // переменные beta и gamma являются открытыми
        ob.beta = 88;
        ob.gamma = 99;
    }
}
