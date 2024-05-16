package org.example;

public class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i=0; i<10000; i++){    //modifying run method to make this thread do out customised tasks
            System.out.println(i);
        }
    }
}
