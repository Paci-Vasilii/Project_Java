package bookpackext;

public class SeriesDemo {
    public static void main(String args[]) {
        ByTwos ob = new ByTwos();
        ByThrees th = new ByThrees();

        for(int i=0; i < 5; i++) {
            System.out.println("Следующее значение: " + th.getNext());
        }
        System.out.println("\nСброс\n");
        th.reset();
        for(int i=0; i < 5; i++)
            System.out.println("Следующее значение: " + th.getNext());

        System.out.println("\nНачальное значение: 100");
        th.setStart(100);
        for (int i=0; i < 5; i++)
            System.out.println("Следующее значение: " + th.getNext());

    }
}
