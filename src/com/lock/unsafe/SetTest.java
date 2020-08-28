package com.lock.unsafe;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            set.add(UUID.randomUUID().toString().substring(0,5));
        }
    }
}
