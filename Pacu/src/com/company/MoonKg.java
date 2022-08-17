package com.company;

public class MoonKg {
    public static void main(String args[]) {
        double вес,вес_на_луне;
        вес = 80;
        вес_на_луне = вес - вес / 100 * 17;
        System.out.println("Мой вес на луне = " + вес_на_луне + " килограмм");
    }
}
