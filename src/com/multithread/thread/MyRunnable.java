package com.multithread.thread;


public class MyRunnable implements Runnable {
    public int num;

    public MyRunnable() {
        this.num = 10;
    }

    @Override
    public void run() {
        while (num!=0){
            num--;
            System.out.println(Thread.currentThread().getName()+" "+num+" ");
        }
    }

    public static void main(String[] args) {
//        MyRunnable mr = new MyRunnable();
        for (int i = 0; i < 3; i++) {
            new Thread(new MyRunnable(), i + "").start();
        }
    }
}
