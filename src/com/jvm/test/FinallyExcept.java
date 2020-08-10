package com.jvm.test;

public class FinallyExcept {
    public static void main(String[] args) {
        int result = test();
        System.out.println(result);

    }

    public static int test(){
        int x =10;
        try{
            return x;
        }finally {
            x = 20;
        }
    }
}
