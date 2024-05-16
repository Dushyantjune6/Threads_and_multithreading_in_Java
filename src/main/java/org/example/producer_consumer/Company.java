package org.example.producer_consumer;

public class Company {

    int n;
    boolean isBufferEmpty = false;
    //if(f)? producer :consumer;


    synchronized public int consumeItem() {

        if (isBufferEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consumed " + this.n);
        isBufferEmpty = false;
        notify();
        return this.n;

    }

    synchronized public void produceItem(int n) {
        if (!isBufferEmpty) {
            this.n = n;
            System.out.println("Produced " + this.n);
            isBufferEmpty = false;
            notify();
        }
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
