package com.company;

public class VehConsDemo {
    public static void main (String args[]) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle cruzak = new Vehicle(2, 14, 12);
        Vehicle reno = new Vehicle(10, 10, 10);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);

        System.out.println("Для преодоления " + dist +  " миль мини-фургону требуется " + gallons + " галлонов топлива");

        gallons = cruzak.fuelneeded(dist);

        System.out.println("Для преодоления " + dist +  " внедорожнику требуется " + gallons + " галлонов топлива");

        gallons = reno.fuelneeded(dist);

        System.out.println("Для преодоления " + dist +  " седану требуется " + gallons + " галлонов топлива");

    }
}

