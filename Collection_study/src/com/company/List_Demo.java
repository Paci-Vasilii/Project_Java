package com.company;

import java.util.*;

public class List_Demo {
    public static void main(String[] args) {
        Map collection = new HashMap();

        collection.put("1", "Dan Brown");
        collection.put("2", "Karnegi");
        collection.put("3", "Jack London");
        collection.put("4", "Putin");
        collection.put("5", "Trump");
        collection.put("6", "Stalin");


        System.out.println(collection.get("2"));

        Set set = collection.entrySet();
        for(Object o : set) {
            System.out.println(o);
        }

    }
}
