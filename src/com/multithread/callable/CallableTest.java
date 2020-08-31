package com.multithread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread thread = new MyThread();
        FutureTask<String> futureTask = new FutureTask<>(thread);
        new Thread(futureTask,"A").start();
        new Thread(futureTask,"V").start();
        String s = futureTask.get();
        System.out.println(s);
    }
}

class MyThread implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("123");
        return "ABC";
    }
}
