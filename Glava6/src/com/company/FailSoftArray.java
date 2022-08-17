package com.company;

public class FailSoftArray {
    private int a[];        //ссылка на массив
    private int errval;     //значение, возвращаемое в случае возникновения ошибки
                            // при выполнении метода get()

    public int length;

    /* Конструктору данного класса передается размер массива и значение, которое должен возвращать метод get()
        при возникновении ошибки  */
public FailSoftArray(int size, int errv) {
    a = new int[size];
    errval = errv;
    length = size;
}
    // Возвратить значение элемента массива с заданным индексом
    public int get(int index) {
    if(indexOK(index)) return a[index];
    return errval;
    }

    //Установить значение элемента с заданным индексом
    //Если возникнет ошибка, возвратить логическое значение false.
    public boolean put(int index, int val) {
    if(indexOK(index)) {
        a[index] = val;
        return true;
    }
    return false;
    }

    //Вернуть логическое значение true, если индекс
    // не выходит за границы массива
    private boolean indexOK(int index) {
    if(index >= 0 & index < length) return true;
    return false;
    }
}
