package com.lock;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class SemaphoreTest {
    public static Semaphore sp = new Semaphore(5);

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            new Student(sp,"student"+i).start();
        }
    }
}
