package qpack;

public class CircularQueue implements ICharQ{
    private char q[];
    private int putloc, getloc;

    public CircularQueue(int size) {
        q = new char[size+1];
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if(putloc+1==getloc |
                ((putloc==q.length-1) & (getloc==0))) {
            System.out.println("- Очередь заполнена");
            return;
        }

        putloc++;
        if(putloc== q.length) putloc = 0; // Перейти в начало массива
        q[putloc] = ch;
    }

    public char get() {
        if(getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }

        getloc++;
        if (getloc== q.length) getloc = 0; // Вернуться в начало очереди
            return q[getloc];
    }
    public void reset() {

    }
}
