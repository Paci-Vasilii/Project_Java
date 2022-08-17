package com.company;

public class Gen<T extends Number> {
    T ob;

    T vals[]; //допустимо

    Gen(T o, T[] nums) {
        ob = o;
    }

    T getob() {
        return ob;
    }

    void showType() {
        System.out.println("Тип Т - это " + ob.getClass().getName());
    }
}

class GenArrays {
    public static void main(String args[]) {
        Integer n[] = { 1, 2, 3, 4, 5 };

        Gen<Integer> iOb = new Gen<Integer>(50, n);

        // Невозможно создать массив обобщенных ссылок
        // на объекты конкретного типа
        // Gen<Integer> gens[] = new Gen<Integer>[1O]; // Ошибка!

        // Cледующее выражение допустимо
        Gen<?> gens[] = new Gen<?>[10];


    }
}
