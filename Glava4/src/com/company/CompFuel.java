package com.company;

public class CompFuel {
    public static void main (String args[]) {
        Vehicle minivan = new Vehicle(2, 3 , 4);
        Vehicle cruzak = new Vehicle(2, 4, 4);
        Vehicle reno = new Vehicle(2, 5, 5);
        double gallons;
        int dist = 252;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        cruzak.passengers = 4;
        cruzak.fuelcap = 50;
        cruzak.mpg = 15;

        reno.passengers = 5;
        reno.fuelcap = 40;
        reno.mpg = 10;

        gallons = minivan.fuelneeded(dist);
        System.out.println("Для преодоления " + dist +  " миль мини-фургону требуется " + gallons + " галлонов топлива");

        gallons = cruzak.fuelneeded(dist);
        System.out.println("Для преодоления " + dist +  " внедорожнику требуется " + gallons + " галлонов топлива");

        gallons = reno.fuelneeded(dist);
        System.out.println("Для преодоления " + dist +  " седану требуется " + gallons + " галлонов топлива");

    }
}
