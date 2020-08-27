package com.lock.pc;

public class Source {
    private int number = 0;

    public synchronized void increment() throws InterruptedException {
        while (number !=0){
            this.wait();
        }
        number++;
        System.out.println(Thread.currentThread().getName()+"--->"+number);
        this.notifyAll();
    }

    public synchronized void decrement() throws InterruptedException {
        while (number == 0){
            this.wait();
        }
        number--;
        System.out.println(Thread.currentThread().getName()+"--->"+number);
        this.notifyAll();
    }
}
