package org.example.producer_consumer;

public class ProducerThread extends Thread {

    Company c;

    public ProducerThread(Company c) {
        this.c = c;
    }

    public void run() {
        int i = 1;
        while (true) {
            this.c.produceItem(i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i += 1;
        }
    }
}
