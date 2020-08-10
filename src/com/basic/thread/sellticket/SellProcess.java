package com.basic.thread.sellticket;

public class SellProcess {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();

        Thread t1 = new Thread(st,"win1");
        Thread t2 = new Thread(st,"win2");
        Thread t3 = new Thread(st, "win3");

        t1.start();
        t2.start();
        t3.start();
    }
}
