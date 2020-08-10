package com.basic.thread.producercustomer;

public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box();

        Producer p =new Producer(box);
        Customer c =new Customer(box);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();
    }

}
