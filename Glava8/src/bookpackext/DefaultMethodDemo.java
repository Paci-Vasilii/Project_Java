package bookpackext;

public class DefaultMethodDemo {
    public static void main(String args[]) {

        MyIFImp obj = new MyIFImp();
        MyIFmp2 obg = new MyIFmp2();

        // вызов метода getUserID() возможен, поскольку он явно
        // реализован классом MyIFImp
        System.out.println("Идентификатор пользователя: " + obj.getUserID());

        // вызов метода getAdminID() также возможен, поскольку
        // предоставляется его реализация по умолчанию
        System.out.println("Идентификатор администратора: " + obj.getAdminID());

        System.out.println("Идентификатор пользователя: " + obg.getUserID());
        System.out.println("Идентификатор администратора: " + obg.getAdminID());
        int uID = MyIF.getUniversalID(100);
        System.out.println("uID равен: " + uID);
    }
}
