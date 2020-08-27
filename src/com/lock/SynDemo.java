package com.lock;

public class SynDemo {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(()->{for(int i=0;i<60;i++) ticket.sellTicket();},"A").start();
        new Thread(()->{for(int i=0;i<60;i++) ticket.sellTicket();},"B").start();
        new Thread(()->{for(int i=0;i<60;i++) ticket.sellTicket();},"C").start();
    }
}
class Ticket {
    private int number = 50;

    public synchronized void sellTicket() {
        if (number > 0) {
            System.out.println(Thread.currentThread().getName() + "卖出" + (50 - (--number)) + "票，还剩" + number);
        }
    }
}
