package com.multithread.util;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDown = new CountDownLatch(6);
        for (int i = 0; i < 6; i++) {
            new Thread(()->{
//                计数器减一
                System.out.println(Thread.currentThread().getName());
                countDown.countDown();
            },String.valueOf(i)).start();
        }

//        等待计数器归零，才会继续往下走
        countDown.await();
        System.out.println("close door");
    }
}
