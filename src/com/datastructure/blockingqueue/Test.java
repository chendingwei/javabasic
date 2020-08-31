package com.datastructure.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        test2();
    }

//    抛出异常
    public static void test1(){
        ArrayBlockingQueue queue = new ArrayBlockingQueue<>(3);

        System.out.println(queue.add("a"));
        System.out.println(queue.add("b"));
        System.out.println(queue.add("c"));

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
//    不抛出异常，用返回值
    public static void test2(){
        ArrayBlockingQueue queue = new ArrayBlockingQueue<>(3);

        System.out.println(queue.offer("a"));
        System.out.println(queue.offer("a"));
        System.out.println(queue.offer("a"));

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());


    }
//      阻塞等待
    public static void test3() throws InterruptedException {
        ArrayBlockingQueue queue = new ArrayBlockingQueue(3);
        queue.put("a");
    }
//      超时等待
    public static void test4() throws InterruptedException {
        ArrayBlockingQueue queue = new ArrayBlockingQueue(3);

        queue.offer("a",2, TimeUnit.SECONDS);
    }
}

