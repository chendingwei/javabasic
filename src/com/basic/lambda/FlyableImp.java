package com.basic.lambda;

public class FlyableImp implements Flyable {
    @Override
    public void fly(String s) {
        System.out.println(s+" can fly");
    }
}
