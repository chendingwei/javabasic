package com.lock;

import java.sql.Time;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockTest {
    public static void main(String[] args) {
        MyCache myCache = new MyCache();
        for (int i = 0; i < 5; i++) {
            final int temp = i;
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName()+"创建成功");
                myCache.put(temp+"",temp+"");
            }, String.valueOf(i)).start();
        }


        for (int i = 5; i < 10; i++) {
            final int temp = i;
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"创建成功");
                myCache.get(temp+"");
            },String.valueOf(temp)).start();
        }
    }
}


class MyCache{
    private ReadWriteLock lock = new ReentrantReadWriteLock();
    private volatile Map<String, String> map = new HashMap<>();
    public void put(String key, String val){
        lock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+"写入"+key);
            map.put(key, val);
            TimeUnit.SECONDS.sleep(2);
            System.out.println(Thread.currentThread().getName()+"写入完成");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }

    public void get(String key){
        lock.readLock().lock();

        try {
            System.out.println(Thread.currentThread().getName()+"读取"+key);
            String s = map.get(key);
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread().getName()+"读取完成");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();
        }
    }

}