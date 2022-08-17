package com.company;

public class StackTest {
    public static void main(String args[]) {
       // testQueue();
       // testStack();
        StackTest abs = new StackTest();
        
        System.out.println(abs.Gay("Пошел нахуй"));
    }

    String Gay(String abra) {
        String x = abra;
        return  x;
    }


    private static void testQueue() {
        SimpleQueue<Integer> queue = new SimpleQueue<>();
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            queue.add(i);
        }
        System.out.println("\n");

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }

    private static void testStack() {
        SimpleStack<Integer> queue = new SimpleStack<>();
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            queue.push(i);
        }
        System.out.println("\n");

        while (!queue.isEmpty()) {
            System.out.println(queue.pop());
        }
    }
}

