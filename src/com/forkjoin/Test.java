package com.forkjoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        test1(); //25089ms
//        test2();// stack over flow
        test3();// 406ms
    }

    public static void test1(){
        long start = System.currentTimeMillis();
        Long sum = 0L;
        for (Long i = 1L; i <10_0000_0000 ; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start+"ms");
    }

    public static void test2() throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTest test = new ForkJoinTest(0L, 10_0000_0000L);
        ForkJoinTask<Long> submit = forkJoinPool.submit(test);
        Long sum = submit.get();
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end-start+"ms");
    }

    public static void test3(){
        long start = System.currentTimeMillis();
        long sum = LongStream.rangeClosed(0, 10_0000_0000).parallel().reduce(0, Long::sum);
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end-start+"ms");
    }
}
