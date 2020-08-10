package com.basic.thread.producercustomer;

public class Box {
    private int milk;
    private boolean state = false;

    public synchronized void setMilk(int milk) {
        if(state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk = milk;
        System.out.println("第"+milk+"牛奶放入奶箱");
        state = true;
        notifyAll();
    }

    public synchronized void getMilk() {
        if(!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("拿到第"+milk+"瓶奶");
        state=false;
        notifyAll();
    }
}
