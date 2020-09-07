package com.cas;

import java.util.concurrent.atomic.AtomicInteger;

public class Test {

    public static void main(String[] args) {
        AtomicInteger atomic = new AtomicInteger(2020);
        atomic.compareAndSet(2020,2021);

        atomic.getAndIncrement();
    }

}
