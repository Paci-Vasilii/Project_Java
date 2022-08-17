package com.company;

import javax.tools.Tool;

enum Tools {
    SCREWDRIVER, WRENCH, HAMMER, PLIERS
}
public class Ex3 {

    static void values() {

        for(Tools t : Tools.values())
            System.out.println(t);

        return;
    }

    public static void main(String args[]) {

        values();
    }
}
