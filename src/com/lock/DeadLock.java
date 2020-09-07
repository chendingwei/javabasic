package com.lock;

import java.util.concurrent.TimeUnit;

public class DeadLock {
    public static void main(String[] args) {
        String lockA ="LockA";
        String lockB = "LockB";

        new Thread(new MyThread(lockA,lockB)).start();
        new Thread(new MyThread(lockB,lockA)).start();
    }
}

class MyThread implements Runnable{
    @Override
    public void run() {
        synchronized (lockA){
            System.out.println(Thread.currentThread().getName() + " lock:" + lockA +
                    " get -> "+ lockB);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lockB){
                System.out.println(Thread.currentThread().getName() + " lock:" + lockB +
                        " get -> "+ lockA);

            }
        }
    }

    private String lockA;
    private String lockB;

    public MyThread(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

}
