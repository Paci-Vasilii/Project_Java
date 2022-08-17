package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Collection collection = new ArrayList();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.remove("2");
        for(Object o : collection) {
            System.out.println(o);
        }

    }
}
