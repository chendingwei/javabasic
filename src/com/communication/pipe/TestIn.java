package com.communication.pipe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestIn implements Runnable{
    private Process p = null;

    public TestIn(Process p) {
        this.p = p;
    }

    @Override
    public void run() {
        InputStream in = p.getInputStream();
        BufferedReader bfr = new BufferedReader(new InputStreamReader(in));
        try {
            String rd = bfr.readLine();
            if(rd != null){
                System.out.println(rd);
            }else {
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
