package com.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


// ThreadPoolExecutor.AbortPolicy());  人满，拒绝服务
// ThreadPoolExecutor.CallerRunsPolicy()); 哪里来的去哪里
// ThreadPoolExecutor.DiscardPolicy(); 队列满了，不会抛出异常
// ThreadPoolExecutor.DiscardOldestPolicy()  队列满了，尝试和最早的竞争，竞争失败直接丢弃任务
public class MyThreadPool {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                2,
                Runtime.getRuntime().availableProcessors(),
                3,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardOldestPolicy());

        System.out.println(Runtime.getRuntime().availableProcessors());

        try{
            for (int i = 0; i < 10; i++) {
                pool.execute(()->{
                    System.out.println(Thread.currentThread().getName()+"   OK");
                });
            }
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            pool.shutdown();
        }
    }
}
