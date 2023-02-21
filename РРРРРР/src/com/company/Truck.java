package com.company;

public class Truck extends Transport{

    public Engine engine = new Engine();

    private boolean loaded;

    public Truck(String brand, int weight, int[] coordinate, boolean loaded) {
        super(brand, weight, coordinate);
        this.loaded = loaded;
    }
    public Truck(String brand, int weight, int[] coordinate) {
        super(brand, weight, coordinate);
    }

    public void setLoaded(boolean loaded){
        this.loaded = loaded;
    }

    public String getLoaded() {
        if(loaded)
            return "Грузовик загружен";
        else
            return"Грузовик не загружен";
    }

    @Override
    public String getValues() {
        System.out.println(super.getValues());
        return getLoaded() + "\n" + engine.getInfo();
    }
}
