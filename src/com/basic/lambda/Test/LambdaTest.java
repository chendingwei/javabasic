package com.basic.lambda.Test;

import com.basic.lambda.MyRunnable;

public class LambdaTest {

    public static void main(String[] args) {
//        实现类
//        MyRunnable my = new MyRunnable();
//        Thread t = new Thread(my);
//        t.start();

//        匿名内部类
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("multi thread start");
//            }
//        }).start();

//        lambda表达式
        new Thread(()-> {
            System.out.println("multi thread start");
        }).start();
    }
}
