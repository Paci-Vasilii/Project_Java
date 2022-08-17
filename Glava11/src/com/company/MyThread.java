package com.company;

public class MyThread implements Runnable {
    Thread thrd;

    volatile boolean suspended;
    volatile boolean stopped;

    MyThread(String name) {
        thrd = new Thread(this, name); // присвоить имя потоку
        suspended = false;
        stopped = false;
        thrd.start();     // запустить поток
    }

    // Точка входа в поток
    public void run() {
        System.out.println(thrd.getName() + " - запуск");
        try {
            for (int i = 1; i < 1000; i++) {
                System.out.print(i + " ");
                if ((i%10) ==0 ) {
                    System.out.println();
                    Thread.sleep(250);
                }

                synchronized (this) {
                    while(suspended) {
                        wait();
                    }
                    if(stopped) break;
                }
            }
        }
        catch(InterruptedException exc) {
            System.out.println(thrd.getName() + " - прерван");
        }
        System.out.println(thrd.getName() + " - выход");
    }

    // Остановить поток
    synchronized void mystop() {
        stopped = true;

        // Следующие операторы обеспечивают полную
        // остановку приостановленного потока
        suspended = false;
        notify();
    }

    //Приостановить поток
    synchronized void mysuspend() {
        suspended = true;
    }

    // Возобновить поток
    synchronized void myresume() {
        suspended = false;
        notify();
    }
}
