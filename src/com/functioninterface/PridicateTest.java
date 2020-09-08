package com.functioninterface;

import java.util.HashMap;
import java.util.function.Predicate;

public class PridicateTest {
    public static void main(String[] args) {
        Predicate<String> stringPredicate = new Predicate<>() {
            @Override
            public boolean test(String s) {
                return false;
            }
        };


        HashMap<String,String> map = new HashMap<>(){
            {
                put("J","B");
                put("B","S");
                put("S","J");
            }
        };

        Predicate<String> pre = (str)->{
            boolean j = map.get(str).equals("J");
            return j;
        };

        System.out.println(pre.test("S"));

    }
}
