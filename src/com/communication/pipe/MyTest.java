package com.communication.pipe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String str = bfr.readLine();
            if(str != null){
                System.out.println(str);
            }else {
                return;
            }
        }
    }
}
