package org.example.producer_consumer;

public class ConsumerThread extends Thread {
    Company c;

    public ConsumerThread(Company c) {
        this.c = c;
    }

    public void run() {

        while (true) {
            this.c.consumeItem();
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
