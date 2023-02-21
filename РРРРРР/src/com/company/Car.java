package com.company;

public class Car extends Transport implements ILight {

    private boolean light = false;

    public Engine engine = new Engine();

    private boolean Turbo;

    public Car(String brand, int speed, int weight, String color, int[] coordinate) {
        super(brand, speed, weight, color, coordinate);
    }

    public Car(String brand, int speed, int weight, String color, int[] coordinate, boolean turbo) {
        super(brand, speed, weight, color, coordinate);
        this.Turbo = turbo;
    }

    public void setTurbo (boolean turbo) {
        this.Turbo = turbo;
    }

    public String getTurbo() {
        if(Turbo) return "Турбированный";
        else return"Без Турбины";
    }

    @Override
    public String getValues() {
        System.out.println(super.getValues());
        return getTurbo() + "\n" + engine.getInfo();

        }

    public void moveObject(int speed) {
        System.out.println("Автомобиль двигается со скоростью: " + speed);
    }

    @Override
    public void BlinkLight() {
        if(light) System.out.println("Фары моргают!");
        else System.out.println("Фары выключены!");

    }

    @Override
    public void setLight(boolean light) {
        this.light = light;
    }
}

