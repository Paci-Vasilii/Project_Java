package com.company;

public class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }


    T getob1() {
        return ob1;
    }

    V getob2() {
        return ob2;
    }

    void showTypes() {
        System.out.println("Тип Т - это " + ob1.getClass().getName());
        System.out.println("Тип V - это " + ob2.getClass().getName());
    }

    boolean isSame(TwoGen<T, V> o) {
        if(ob1 == o.ob1 && ob2 == o.ob2) return true;
        else return false;
    }
}

class SimpGen {
    public static void main(String args[]) {
        TwoGen<Integer, String> tgObj =
                new TwoGen<> (88, "Обобщения");

        TwoGen<Integer, Integer> tgOb = new TwoGen<>(42, 54);

        tgObj.showTypes();

        int v = tgObj.getob1();
        System.out.println("значение: " + v);

        String str = tgObj.getob2();
        System.out.println("значение: " + str);

        if (tgOb.isSame(new TwoGen<>(42, 54)))
            System.out.println("Совпадают");
    }
}