package com.company;

public class TruckDemo {
    public static void main(String args[]) {

        //Создать ряд новых обьектов типа Truck

        Truck semi = new Truck(2,200,7,44000);
        Truck pickup = new Truck(3,28,15,2000);

        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);

        System.out.println("Грузовик может перевезти " + semi.getCargo()
                            + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль грузовику" +
                " требуется " + gallons + " галлонов топлива.\n");

        gallons = pickup.fuelneeded(dist);

        System.out.println("Пикап может перевезти " + pickup.getCargo()
                + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль пикапу" +
                " требуется " + gallons + " галлонов топлива.\n");

        //создать пару обьектов типа внедорожники

        OffRoad Dacia = new OffRoad(4, 100, 8, 4);
        OffRoad Reno = new OffRoad(5, 120, 10, 3);

        gallons = Dacia.fuelneeded(dist);

        System.out.println("Клиренс у автомобиля Dacia " + Dacia.getGroundClearence()
                + " дюйма.");
        System.out.println("Для преодоления " + dist + " миль внедорожнику" +
                " требуется " + gallons + " галлонов топлива.\n");

        gallons = Reno.fuelneeded(dist);

        System.out.println("Клиренс у автомобиля Reno " + Reno.getGroundClearence()
                + " дюйма.");
        System.out.println("Для преодоления " + dist + " миль внедорожнику" +
                " требуется " + gallons + " галлонов топлива.\n");



    }
}
