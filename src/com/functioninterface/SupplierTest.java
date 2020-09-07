package com.functioninterface;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> supplier = new Supplier<>() {
            @Override
            public String get() {
                return null;
            }
        };
    }
}
