package com.lock;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Student extends Thread{
    private Semaphore sp = null;
    private String name = null;

    public Student(Semaphore sp, String name) {
        this.sp = sp;
        this.name = name;
    }


    @Override
    public void run() {
        try {
            System.out.println(name + " 进入了餐厅");
            sp.acquire();
            System.out.println(name+"get the permission");
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            sp.release();
            System.out.println("release window");
        }
    }
}
