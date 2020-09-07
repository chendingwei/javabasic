package designpattern.single;

public class Lazy {

    private Lazy(){

    }

    private static volatile Lazy lazy;
//    double check lock  懒汉式
    public static Lazy getInstance(){
        if(lazy == null){
            synchronized (Lazy.class){
                if(lazy == null) {
                    lazy = new Lazy();//  不是一个原子性操作
                }
            }
        }
        return lazy;
    }
}
