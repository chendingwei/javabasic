package com.communication.pipe;

import java.io.IOException;

public class ParTest {
    public static void main(String[] args) throws IOException {
        Process p = Runtime.getRuntime().exec("java com.communication.pipe.MyTest");

        StringBuilder sb = new StringBuilder();
        for(int k=0;k<1;k++){
            sb.append("hello");
        }

        int outSize = 1;
        TestOut[] testOuts = new TestOut[outSize];
        for(int i=0;i<outSize;i++){
            testOuts[i] = new TestOut(p,sb.toString().getBytes());
            new Thread(testOuts[i]).start();
        }

        int inSize = 1;
        TestIn[] ins = new TestIn[inSize];
        for(int j=0;j<inSize;j++){
            ins[j] = new TestIn(p);
            new Thread(ins[j]).start();
        }
    }
}
