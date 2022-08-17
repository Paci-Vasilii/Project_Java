package com.company;

public interface IVehicle {
    // возвратить дальность транспортного средства
    int range();

    // расчитать обьем топлива, необходимого транспортному
    // средсву для преодоления заданного расстояния
    double fuelneeded (int miles);

    //методы доступа к переменным экземпляра
    int getPassengers();
    void setPassengers(int p);
    int getFuelcap();
    void setFuelcap(int f);
    int getMpg();
    void setMpg(int m);


}
