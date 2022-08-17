package com.company;

public class Queue {
    int q[];               //массив для хранения элементов в очереди
    int putloc, getloc;     //индексы для вставки и извлечения элементов очереди

    Queue(int size) {
        q = new int[size + 1]; // выделить память для очереди
        putloc = getloc = 0;
    }
        // поместить символ в очередь
        void put(int ch) {
            if(putloc == q.length-1) {
                System.out.println(" - Очередь заполнена");
                return;
            }

            putloc++;
            q[putloc] = ch;
        }

        //извлеч символ из очереди
        int get() {
            if(getloc == putloc) {
                System.out.println(" - Очередь пуста");
                return (int) 0;
            }

            getloc++;
            return q[getloc];
        }
    }
