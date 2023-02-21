package com.company;

import java.util.*;

public class TestColl {
    public static void main(String[] args) {


//        List<Integer> arrayL = new ArrayList<>();
//
//        arrayL.add(1);
//        arrayL.add(2);
//        arrayL.add(3);
//        arrayL.add(4);
//        arrayL.add(5);
//        arrayL.add(6);
//        arrayL.add(7);
//        arrayL.add(8);
//        arrayL.add(9);
//
//        System.out.println(arrayL);
//
//        int a = arrayL.size()/2;
//
//        for (int i = 0; i < 5; i++) {
//
//            arrayL.add(a, i);
//            a++;
//        }
//        System.out.println(arrayL);
//
        Map<Integer, String> map = new HashMap<>();

        map.put(0, "Книга 0");
        map.put(1, "Книга 1");
        map.put(2, "Книга 2");
        map.put(3, "Книга 3");
        map.put(4, "Книга 4");
        map.put(5, "Книга 5");
        map.put(6, "Книга 6");

//        for(String a : map.values()){
//            System.out.println(a);
//         }

        Set<Integer> in = map.keySet();

        for (Integer st : in) {
            System.out.println(st);
        }


//
//        Collections.sort(arrayL);
//        System.out.println(arrayL);
//
//        System.out.println();
//
//        System.out.println(arrayL);

//        Set<Integer> set = new LinkedHashSet<>();
//
//
//        set.add(5);
//        set.add(81);
//        set.add(24);
//        set.add(0);
//        set.add(7);
//        set.add(8);
//
//        System.out.println(        );
//        for(Integer s : set)
//        System.out.println(s);
//
//        Queue<Integer> queue = new LinkedList<>();
//        Deque<Integer> dequeue = new ArrayDeque<>();
//        Deque<Integer> linkedDequeue = new LinkedList<>();
//        Queue<Integer> priorityqueue = new PriorityQueue<>();
//
//        priorityqueue.add(11);
//        priorityqueue.add(67);
//        priorityqueue.add(3);
//        priorityqueue.add(94);
//        priorityqueue.add(194);
//        priorityqueue.add(94);
//
//        linkedDequeue.add(11);
//        linkedDequeue.add(67);
//        linkedDequeue.add(3);
//        linkedDequeue.add(94);
//        linkedDequeue.add(194);
//        linkedDequeue.add(94);
//
//        dequeue.add(11);
//        dequeue.add(67);
//        dequeue.add(3);
//        dequeue.add(94);
//        dequeue.add(194);
//        dequeue.add(94);
//
//        queue.add(11);
//        queue.add(67);
//        queue.add(3);
//        queue.add(94);
//        queue.add(194);
//        queue.add(94);
//
//        for (Integer q : queue)
//        System.out.print(q + " ");
//
//        System.out.println();
//
//        for (Integer deq : dequeue)
//            System.out.print(deq + " ");
//
//        System.out.println();
//
//
//        for (Integer lqueue : linkedDequeue)
//            System.out.print(lqueue + " ");
//
//        System.out.println();
//
//        for (Integer p : priorityqueue)
//            System.out.print(p + " ");
//
//        System.out.println();
//
//        while (priorityqueue.size() != 0) {
//            System.out.print(priorityqueue.remove() + " ");
//        }


    }
}
