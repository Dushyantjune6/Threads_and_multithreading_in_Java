package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        System.out.println("This method would be running in a separate thread");
        thread1.run();
    }
}