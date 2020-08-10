package com.basic.lambda;

import com.basic.lambda.Addable;

public class AddableImp implements Addable {
    @Override
    public int add(int x, int y) {
        return x+y;
    }
}
