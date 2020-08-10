package com.basic.lambda.Test;

import com.basic.lambda.Flyable;
import com.basic.lambda.FlyableImp;

public class flyableTest {
    public static void main(String[] args) {
        Flyable fy = new FlyableImp();
        useFlyable(fy);


        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s + " can fly");
            }
        });

        useFlyable((String s)->{
            System.out.println(s + " can fly");
        });
    }
    private static void useFlyable(Flyable fy){
        fy.fly("fish");
    }
}
