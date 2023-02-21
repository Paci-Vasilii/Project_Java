package com.company;

public class Transport {
    private String brand;
    private int speed;
    private int weight;
    private String color;
    private int[] coordinate;

    public Transport(String brand, int speed, int weight, String color, int[] coordinate) {
        this.brand = brand;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    public Transport (String brand, int weight, int[] coordinate) {
        this.brand = brand;
        this.weight = weight;
        this.coordinate = coordinate;
    }

    public String getValues() {

        String res = ("Марка: " + brand + ".\n" + "Скорость: " + speed + "км.\n" +
                "Масса: " + weight + "кг.\n" + "Цвет: " + color + ".");

        String Outcoordinate = "\nКоординаты: ";

        for(int i = 0; i < coordinate.length; i++) {
            Outcoordinate += coordinate[i] + " ";
        }

        return res + Outcoordinate;
    }

    public void stopObject() {
        this.speed = 0;
    }

    class Engine {
        private int km;
        private boolean isReady;

        Engine() {
        }

        public void setValues(int km, boolean isReady) {
            this.km = km;
            this.isReady = isReady;

        }

        public String getInfo() {

            if(isReady) return "Двигатель исправен!";
            else return "Двигатель не работает, он проехал " + km + " км.";
        }

    }
}
