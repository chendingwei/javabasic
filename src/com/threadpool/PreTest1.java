package com.threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PreTest1 {
    public static void main(String[] args) {
//        ExecutorService pool = Executors.newSingleThreadExecutor();
//        ExecutorService pool = Executors.newFixedThreadPool(5);
        ExecutorService pool = Executors.newCachedThreadPool();

        try{
            for (int i = 0; i < 10; i++) {
                pool.execute(()->{
                    System.out.println(Thread.currentThread().getName());
                });
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            pool.shutdown();
        }
    }
}
