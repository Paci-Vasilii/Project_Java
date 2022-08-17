package qpack;

public class DynQueue implements ICharQ{
    private char q[];
    private int putloc, getloc;

    public DynQueue(int size) {
        q = new char[size+1]; // выделить память для очереди
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if(putloc==q.length-1) {
            char t[] = new char[q.length * 2]; // увеличить размер очереди

            for(int i=0; i < q.length; i++)   // скопировать элементы в новую очередь
                t[i] = q[i];
           q = t;
        }

        putloc++;
        q[putloc] = ch;
    }

    // извлечь символ из очереди
    public char get() {
        if(getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }

        getloc++;
        return q[getloc];
    }

    public void reset() {

    }
}
