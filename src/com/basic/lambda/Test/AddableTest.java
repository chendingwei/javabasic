package com.basic.lambda.Test;

import com.basic.lambda.Addable;
import com.basic.lambda.AddableImp;

public class AddableTest {
    public static void main(String[] args) {
        Addable a = new AddableImp();
        useAddable(a);

        useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                return x+y;
            }
        });

        useAddable((int i,int j)->{
            return i+j;
        });

    }

    private static void useAddable(Addable a){
        int res = a.add(10,15);
        System.out.println(res);
    }
}
