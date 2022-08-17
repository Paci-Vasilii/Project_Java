package bookpackext;

public interface Series {
    int getNext(); // возвратить следующее по порядку число

    // Возвратить массив, который содержит n элементов,
    // располагающихся в ряду вслед за текущим элементом
    default int[] getNextArray(int n){
        int[] vals = new int[n];

        for(int i=0; i < n; i++) vals[i] = getNext();
        return vals;
    }

    void reset(); //сброс
    void setStart(int x); // установить начальное значение
}
