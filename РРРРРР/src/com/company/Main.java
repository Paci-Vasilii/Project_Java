package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

/*        int[] arr = new int[] {10, 30, 100, 156, 234, 654, 876, 123, 1, 67};

        int min = arr[0];
        int max = arr[0];

    for(int i = 0; i < arr.length; i++){

        if(min > arr[i])
            min = arr[i];

        if(max < arr[i])
            max = arr[i];

    }

        System.out.println(min);
        System.out.println(max);

 */

  /*      ArrayList<Integer> angu = new ArrayList<>();

        angu.add(11);
        angu.add(22);
        angu.add(33);
        angu.add(44);

//
//        for(int i = 0; i < angu.size(); i++) {
//            System.out.println(angu.get(i));
//        }

        for(Integer el : angu)
            System.out.println(el);
   */

    /*    HashMap<Object, Object> AnguMap = new HashMap<>();

        AnguMap.put("aga", 20);

        System.out.println(AnguMap.isEmpty());
     */

//    int[] Array1 = new int[] {10, 23, 32, 32, 42};
//    int[] Array2 = new int[20];
//
//    for(int i = 0; i < Array2.length; i++) {
//        Array2[i] = i;
//    }
//
//        System.out.println(ArrSumm(Array1));
//        System.out.println(ArrSumm(Array2));
//    }
//
//    public static int ArrSumm(int[] arr) {
//        int summ = 0;
//        for(int i = 0; i < arr.length; i++) {
//            summ += arr[i];
//        }
//        return summ;

    Truck audix8 = new Truck("Audi x8", 250, new int[] {0, 0, 0});
        System.out.println(audix8.getValues());
        System.out.println();

    Truck belaz = new Truck("Mersedes Belaz", 200000, new int[] {100, 200, 100}, true);
            belaz.engine.setValues(100000, false);
        System.out.println(belaz.getValues());
        System.out.println();

    Car Bmw = new Car("Bmw 5",220, 1500, "white",new int[] {150, 0, 150});
            Bmw.engine.setValues(50000, false);
        System.out.println(Bmw.getValues());
        System.out.println();

    Car Mersedes = new Car("Mersedes w140",240, 2000, "black",new int[] {146, 57, -2134}, true);
            Mersedes.engine.setValues(5000, true);
//            Mersedes.moveObject(450);
//            Mersedes.stopObject();
        System.out.println(Mersedes.getValues());
                Mersedes.setLight(true);
                Mersedes.BlinkLight();
        System.out.println();

    Car flyCar = new Car("Impreza",440, 1000, "green",new int[] {100, 1450, -240}, true) {

        @Override
        public void moveObject(int speed) {
            System.out.println("Автомобиль летит со скоростью: " + speed + "км.");

        }
    };
        flyCar.engine.setValues(1500, true);
        System.out.println(flyCar.getValues());
        flyCar.moveObject(500);


    }
}


