package com.company;

public class VehicleDemo {
    public static void main (String args[]) {
        Vehicle minivan = new Vehicle(10, 12, 12);
        Vehicle cruzak = new Vehicle(10, 12, 12);
        Vehicle reno = new Vehicle(10, 12, 12);

        int range1, range2, range3;

        //присвоить значения полям в объекте minivan

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        cruzak.passengers = 4;
        cruzak.fuelcap = 50;
        cruzak.mpg = 15;

        reno.passengers = 5;
        reno.fuelcap = 40;
        reno.mpg = 10;

        //получить дальности поездки для разных транспортных средств
        range1 = minivan.range();
        range2 = cruzak.range();
        range3 = reno.range();

        if(reno.range() > minivan.range()) System.out.println("v1 больше v2");

        System.out.println("Мини-фургон может перевезти " + minivan.passengers + " пассажиров на расстояние " + range1 + " миль.");

        System.out.println("Крузак может перевезти " + cruzak.passengers + " пассажиров на расстояние " + range2 + " миль.");

        System.out.println("Рено может перевести " + reno.passengers + " пассажиров на расстояние " + range3 + " миль.");

    }
}

