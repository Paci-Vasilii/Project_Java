package com.company;

public class OffRoad extends Vehicle {

    private int groundClearence; // дорожный просвет в дюймах

    OffRoad(int p, int f, int m, int cl) {
        super(p, f, m);

        groundClearence = cl;
    }

    // Методы доступа

    int getGroundClearence() {
        return groundClearence;
    }

    void putGroundClerense(int c) {
        groundClearence = c;
    }

}

