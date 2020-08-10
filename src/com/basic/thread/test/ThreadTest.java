package com.basic.thread.test;

import com.basic.thread.MyThread;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("cdw");
        MyThread t2 = new MyThread("lxw");

        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t2.start();

    }
}
