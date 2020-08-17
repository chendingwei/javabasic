package designpattern.singinstance;

public class Unsafe {
    private static Unsafe INSTANCE;

    private Unsafe(){};
// 可以考虑给getInstance方法加锁
//    synchronized
    public static Unsafe getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Unsafe();
        }
        return INSTANCE;
    }


}
