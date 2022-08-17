package com.company;

class Vehicle {
    int passengers; //количество пасажиров
    int fuelcap;    //емкость топливного бака
    int mpg;        //потребление топлива в милях на галлон

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
}
