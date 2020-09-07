package others;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SelectMilkTeaTest {
    public static void main(String[] args) {
        MilkTea milkTea = new MilkTea();
        new Thread(()->{
            for(int i=0;i<=10;i++) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    milkTea.print();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } },"一点点").start();
        new Thread(()->{
            for(int i=0;i<=10;i++) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    milkTea.print();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }},"丸摩堂").start();
        new Thread(()->{
            for(int i=0;i<=10;i++) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    milkTea.print();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } },"茶百道").start();
        new Thread(()->{
            for(int i=0;i<=10;i++) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    milkTea.print();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }},"圆真真").start();

    }
}

class MilkTea{
    private int state = 0;
    private Lock lock = new ReentrantLock();
    private Condition con = lock.newCondition();

    public void print(){
        lock.lock();
        try {
            if(state <9){
                System.out.println(Thread.currentThread().getName());
                state++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
