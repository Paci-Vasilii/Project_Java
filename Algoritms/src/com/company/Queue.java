package com.company;

public interface Queue<T> {
    void add(T item);  // добавить элемент в конец очереди
    T remove();        // извлечь элемент из начала очереди

    boolean isEmpty();
}
