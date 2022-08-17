package com.company;

public class Vehicle {
    private int passengers; //количество пасажиров
    private int fuelcap;    //емкость топливного бака
    private int mpg;        //потребление топлива в милях на галлон

    //это конструктор класса Vihicle
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // возврат дальности поездки
    int range() {
        return mpg * fuelcap;
    }

    // расчитать обьем топлива, необходимого транспортному
    // средсву для преодоления заданного расстояния
    double fuelneeded (int miles) {
        return (double) miles / mpg;
    }

    //методы доступа к переменным экземпляра
    int getPassengers() { return  passengers;}
    void setPassengers(int p) { passengers = p;}
    int getFuelcap() {return fuelcap;}
    void setFuelcap(int f) {fuelcap = f;}
    int getMpg() {return mpg;}
    void setMpg(int m) { mpg = m;}
}
