package com.multithread.thread;

public class MyThread extends Thread{
    private int num;

    public MyThread() {
        this.num = 10;
    }

    @Override
    public void run(){
        while (num !=0){
            num--;
            System.out.println(Thread.currentThread().getName()+" "+num+" ");
        }
    }

    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            new MyThread().start();
        }
    }
}
