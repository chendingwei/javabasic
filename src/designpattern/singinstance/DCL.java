package designpattern.singinstance;

public class DCL {
    private static DCL INSTANCE;
    private DCL(){};

    public static DCL getInstance() {
        if(INSTANCE == null){
            synchronized (DCL.class){
                if(INSTANCE == null){
                    INSTANCE = new DCL();
                }
            }
        }
        return INSTANCE;
    }
}
