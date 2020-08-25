package com.communication.pipe;

import java.io.IOException;

public class ProcessTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        Process p = Runtime.getRuntime().exec("java com.communication.pipe.MyTest");

        TestOut out = new TestOut(p,"Hello everyone".getBytes());
        new Thread(out).start();

        TestIn in = new TestIn(p);
        new Thread(in).start();

        Thread.sleep(3000);

        TestOut out2 = new TestOut(p, "-hellp-everyone".getBytes());
        new Thread(out2).start();

        TestIn in2 = new TestIn(p);
        new Thread(in2).start();
    }
}
