package com.company;

public class ThreadCom {
    public static void main(String args[]) {
        TickTock tt = new TickTock();
        MyThread mt1 = new MyThread("Tick");
        MyThread mt2 = new MyThread("Tock");

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch(InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }
    }
}
