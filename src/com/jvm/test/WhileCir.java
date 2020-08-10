package com.jvm.test;

public class WhileCir {
    static boolean run = true;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            while (run){
            }
        });
        t.start();

        Thread.sleep(1000);
        run = false;
    }
}
