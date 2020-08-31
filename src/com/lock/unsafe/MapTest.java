package com.lock.unsafe;

import javax.swing.plaf.basic.BasicScrollPaneUI;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {
    public static void main(String[] args) {
//        HashMap<String, String> map = new HashMap<>();
//        默认等价HashMap<>(16,0.75)
//        加载因子，初始容量


        Map<String,String> map = new ConcurrentHashMap<>();
        for (int i = 0; i < 30; i++) {
            new Thread(()->{
                map.put(Thread.currentThread().getName(), UUID.randomUUID().toString().substring(0, 5));
                System.out.println(map);
            },String.valueOf(i)).start();
        }
    }
}
