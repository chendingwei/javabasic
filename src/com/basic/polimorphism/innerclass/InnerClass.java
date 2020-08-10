package com.basic.polimorphism.innerclass;

/*
内用外随意访问，外用内，需要内部类对象。
 */
public class InnerClass {
    public static void main(String[] args) {
        Body body = new Body();
//        Body.Heart heart = body.new Heart();
//        heart.beat();
        body.methodBH();
    }
}
