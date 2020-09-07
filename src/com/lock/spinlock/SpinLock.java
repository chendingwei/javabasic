package com.lock.spinlock;

import java.util.concurrent.atomic.AtomicReference;

public class SpinLock {

    private AtomicReference<Thread> atomicReference = new AtomicReference<>();

    public void myLock(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+"-> mylock");

        while ( !atomicReference.compareAndSet(null,thread)){

        }
    }

    public void myUnlock(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+"->myunlock");
        atomicReference.compareAndSet(thread,null);
    }
}
