package others;

import javax.swing.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SelectMilkTeaTest {
    public static void main(String[] args) {
        MilkTea milkTea = new MilkTea();

        new Thread(()->{
            milkTea.delay();
        }).start();

        new Thread(()->{
            milkTea.print();
            },"一点点").start();
        new Thread(()->{
            milkTea.print();
            },"丸摩堂").start();
        new Thread(()->{
            milkTea.print();
            },"茶百道").start();
        new Thread(()->{
            milkTea.print();
            },"圆真真").start();
    }
}

class MilkTea{
    private int state = 0;
    private Lock lock = new ReentrantLock();
    private Condition con = lock.newCondition();

    public void delay(){
        lock.lock();
        try {
            TimeUnit.SECONDS.sleep(5);
            con.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }

    public void print(){
        lock.lock();
        try {
            con.await();
            System.out.println(Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
