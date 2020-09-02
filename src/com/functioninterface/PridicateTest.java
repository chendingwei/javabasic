package com.functioninterface;

import java.util.function.Predicate;

public class PridicateTest {
    public static void main(String[] args) {
        Predicate<String> stringPredicate = new Predicate<>() {
            @Override
            public boolean test(String s) {
                return false;
            }
        };
    }
}
