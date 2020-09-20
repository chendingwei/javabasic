package com.lock.spinlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class SpinLock {

    private AtomicReference<Thread> atomicReference = new AtomicReference<>();

    public void myLock(){
        Thread thread = Thread.currentThread();
        while ( !atomicReference.compareAndSet(null,thread)){
            System.out.println(thread.getName()+"-> 在竞争锁");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(thread.getName()+"-> mylock");
    }

    public void myUnlock(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+"->myunlock");
        atomicReference.compareAndSet(thread,null);
    }
}
