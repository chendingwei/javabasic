package com.basic.lambda.Test;

import com.basic.lambda.Eatable;
import com.basic.lambda.EatableImp;

public class EatableTest {
    public static void main(String[] args) {
        Eatable e = new EatableImp();
        useEatable(e);

        useEatable(new Eatable(){
            @Override
            public void eat() {
                System.out.println("eat apple");
            }
        });

        useEatable(()->{
            System.out.println("eat apple");
        });
    }

    private static void useEatable(Eatable e){
        e.eat();
    }
}
