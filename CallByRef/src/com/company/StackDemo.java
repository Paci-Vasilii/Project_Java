package com.company;
import java.util.Stack;

public class StackDemo {
    public static void main(String args[]) {

        Stack stack = new Stack(1);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.print("Содержимое stack изначально: " + stack);
        System.out.println();

        stack.pop();
        stack.pop();

        System.out.print("Содержимое stack после удаления 1 и 2 в очереди: " + stack);
        System.out.println();

        stack.push(6);
        stack.push(7);
        stack.push(8);

        System.out.print("Содержимое stack с добавлением в очередь 6, 7, 8 : " + stack);
        }
    }

