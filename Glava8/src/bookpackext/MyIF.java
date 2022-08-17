package bookpackext;

public interface MyIF {
    // объявление обычного метода интерфейса, которое не включает
    // определение реализации по умолчанию
    int getUserID();

    //Объявление метода по умолчанию, включающее его реализацию
    default int getAdminID() {
        return 1;
    }

    static int getUniversalID(int gay) {
        return gay / 2;
    }
}
