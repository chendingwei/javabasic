package com.multithread.volatiletest;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class VolatileTest {
    public volatile static int num = 0;
    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            while (num == 0) {

            }
        }).start();

        TimeUnit.SECONDS.sleep(2);

        num = 1;

        System.out.println(num);

    }
}
