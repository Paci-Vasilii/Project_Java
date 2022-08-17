package com.company;

public class Stack {
    private char stck[]; // Массив для хранения элементов стека
    private int tos;    // Вершина стека.
    // построить пустой стек заданного размера

    Stack(int size) {
        stck = new char[size]; // выделить память для стека
        tos = 0;
    }

    // построить один стек из другого стека
    Stack(Stack ob) {
        tos = ob.tos;
        stck = new char[ob.stck.length];
        // скопировать элементы
        for(int i=0; i < tos; i++)
            stck[i] = ob.stck[i];
    }

    // построить стек с исходными значениями
    Stack(char a[]) {
        stck = new char[a.length];
        for(int i = 0; i < a.length; i++) {
            push(a[i]);
        }
    }

    // поместить символы в стек
    void push(char ch) {
        if(tos==stck.length) {
            System.out.println(" — Stack is full.");
            return;
        }

        stck[tos] = ch;
        tos++;
    }

    // извлечь символы из стека
    char pop() {
        if(tos==0) {
            System.out.println(" — Stack is empty.");
            return (char) 0;
        }
        tos--;
        return stck[tos];
    }
}

