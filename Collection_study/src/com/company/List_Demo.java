package com.company;

import java.util.*;

public class List_Demo {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>(10);

        List<String> linkedList = new LinkedList<>();

        List<String> vector = new Vector<>();

        List<Integer> stack = new Stack<>();

        Set<Integer> hashset = new HashSet<>();


   //     List<String> syncList = Collections.synchronizedList(new ArrayList<>());


        for (int i = 0; i < 10; i++) {
            arrayList.add("A");
        }

        for (int i = 0; i < 10; i++) {
            linkedList.add("A");
        }

        //                                          ARRAY LIST

      //  arrayList.add(arrayList.size() / 2, "12");

       // arrayList.clear(); // очищает данные в массиве

      //  System.out.println(arrayList.equals(linkedList)); // сравнивает 2 массива по содержанию, если число обьектов и сами обьекты равны то выводит true.


      //  System.out.println("Удаленный обьект: " + arrayList.remove(6)); // достает элемент из коллекции(который можно вывести на экран) и удаляет его.

     //   System.out.println(arrayList);

     //   System.out.println(arrayList.isEmpty()); // выводит true если коллекция пустая и false если она заполнена


     //   System.out.println(arrayList.indexOf("A"));            // показывает в какой ячейке первый раз встречается число 12

     //   System.out.println(arrayList.lastIndexOf("A"));     // показывает в какой ячейке последний раз встречается символ 'A'

    //   System.out.println("хэшкод " + arrayList.hashCode()); // выводит хэшкод колекции

     //  System.out.println(arrayList.get(10)); // выводит 10тый элемент массива

     //                                       LINKED LIST

      //  linkedList.clear(); // очищает данные в массиве

       // System.out.println(linkedList.isEmpty()); // выводит true если коллекция пустая и false если она заполнена


        for (int i = 0; i < 10; i++) {                                          //
            linkedList.add(linkedList.size()/2,"2");             //       вставляет в середину массива 10 элементов
        }                                                                    //

        System.out.println("LinkedList: " + linkedList + "\n");
    //    System.out.println(linkedList.size()); // показывает количество элементов массиве

    //                                          STACK

        for (int i = 0; i < 10; i++) {
            stack.add(i);
        }

        for (int i = 0; i < 10; i++) {
            stack.add(stack.size() / 2, 0);
        }

        System.out.println("Stack: " + stack);

        System.out.print("Вывод через строку: ");

        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + ", ");
        }
        System.out.println();

        //                                          SET

        hashset.add(1);
        hashset.add(2);
        hashset.add(3);
        hashset.add(4);
        hashset.add(5);
        hashset.add(6);
        hashset.add(7);
        hashset.add(8);

        System.out.print("HashSet: ");
        for(Integer s : hashset)
        System.out.print(s + ", ");

    }
}
