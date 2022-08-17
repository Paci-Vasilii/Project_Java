package com.company;

public class Truck extends Vehicle {
    private int cargocap; // грузоподъемность в фунтах

    //Конструктор класса Truck
    Truck(int p, int f, int m, int c) {
        super(p, f, m);

        cargocap = c;
    }

    //Методы доступа к переменной cargocap
    int getCargo() {return cargocap;}
    void putCargo(int c) { cargocap = c;}
}
