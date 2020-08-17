package designpattern.singinstance;

import java.lang.ref.PhantomReference;

public class Lock {
    private static Lock INSTANCE;

    private Lock(){};

    public static Lock getInstance(){
        if(INSTANCE == null){
            synchronized (Lock.class){
                INSTANCE = new Lock();
            }
        }
        return INSTANCE;
    }
}
