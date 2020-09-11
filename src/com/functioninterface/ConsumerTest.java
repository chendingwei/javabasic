package com.functioninterface;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = new Consumer<>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        Consumer<String> consumer = (str)->{
            System.out.println(str);
        };

        consumer.accept("abc");
    }
}
