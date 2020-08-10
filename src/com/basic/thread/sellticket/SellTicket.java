package com.basic.thread.sellticket;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable {
    private int tickets = 100;
    private Object obj = new Object();

    //    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
//            lock.lock();
            synchronized (obj) {
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在出票" + tickets);
                    tickets--;
                } else {
                    System.out.println(Thread.currentThread().getName() + "票已卖完");
                    break;
                }
//            lock.unlock();

            }
        }
    }
}