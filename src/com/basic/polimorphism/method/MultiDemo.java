package com.basic.polimorphism.method;

public class MultiDemo {

    public static void main(String[] args) {
        Parent par = new Son();
        par.method();
        par.parMethod();
    }
}
