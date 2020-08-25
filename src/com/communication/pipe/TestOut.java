package com.communication.pipe;

import java.io.IOException;
import java.io.OutputStream;

public class TestOut implements Runnable{
    private Process p = null;
    private byte[] b = null;

    public TestOut(Process p, byte[] b) {
        this.p = p;
        this.b = b;
    }


    @Override
    public void run() {
        OutputStream outputStream = p.getOutputStream();
        try {
            outputStream.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
