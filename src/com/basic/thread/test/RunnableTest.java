package com.basic.thread.test;

import com.basic.thread.MyRunable;

public class RunnableTest {
    public static void main(String[] args) {
        MyRunable my = new MyRunable();

        Thread t1 = new Thread(my);
        Thread t2 = new Thread(my);

        t1.start();
        t2.start();
    }
}
