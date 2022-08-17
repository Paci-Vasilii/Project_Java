package com.company;

public interface ICharQ {
        void put(char ch) throws QueueFullException; // поместить символ в очередь

        char get() throws QueueEmptyException; // извлечь символ из очереди

    }
