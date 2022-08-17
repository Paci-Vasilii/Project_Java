package com.company;

public class NumereticFns<T extends Number> {
    T num;

    NumereticFns(T n) {
        num = n;
    }

    double reciprocal() {
        return 1 / num.doubleValue();
    }

    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    boolean absEqual(NumereticFns<?> ob) {
        if (Math.abs(num.doubleValue()) ==
            Math.abs(ob.num.doubleValue())) return true;

        else return false;
    }
}

class BoundsDemo {
    public static void main(String args[]) {

        NumereticFns<Integer> iOb = new NumereticFns<Integer>(5);

        System.out.println("Обратная величина iOb - " +
                             iOb.reciprocal());
        System.out.println("Дробная часть iOb - " +
                iOb.fraction());

        System.out.println();

        NumereticFns<Double> dOb = new NumereticFns<Double>(5.25);

        System.out.println("Обратная величина dOb - " +
                dOb.reciprocal());
        System.out.println("Дробная часть dOb - " +
                dOb.fraction());

      //  Использование шаблонов аргументов 477
    }
}