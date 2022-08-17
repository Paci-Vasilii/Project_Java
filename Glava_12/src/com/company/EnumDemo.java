package com.company;

// перечисление, представляющее разновидности транспортных средств
enum Transport {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

    private int speed; // типичная скорость транспортного средства

    //Конструктор
    Transport(int s) { speed = s; }

    //метод
    int getSpeed() { return speed; }
}

public class EnumDemo {
    public static void main(String args[]) {
        Transport tp;

        tp = Transport.AIRPLANE;

        //Отобразить перечислимое значение
        System.out.println("Значение tp: " + tp);
        System.out.println();

        tp = Transport.TRAIN;

        // Сравнить 2 перечислимых значения

        if(tp == Transport.TRAIN)
            System.out.println("tp содержит TRAIN\n");

        //Использовать перечисление для управления оператором switch

        switch (tp) {
            case CAR:
                System.out.println("Автомобиль перевозит людей");
                break;
            case TRUCK:
                System.out.println("Грузовик перевозит груз");
                break;
            case AIRPLANE:
                System.out.println("Самолет летит");
                break;
            case TRAIN:
                System.out.println("Поезд движется по рельсам");
                break;
            case BOAT:
                System.out.println("Лодка плывет по воде");
                break;
        }
    }
}
