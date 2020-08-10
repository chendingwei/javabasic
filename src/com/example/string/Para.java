package com.example.string;

public class Para {
    public static void main(String[] args) {

        String str1 = "aaa";
        String str2 = new String("aaa");
        String str3 = "aaa";

        System.out.println(str1==str2);
        System.out.println(str1==str3);
    }
}
