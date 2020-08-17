package designpattern.singinstance;

public class Simplfy {
    private static final Simplfy INSTANCE = new Simplfy();

    private Simplfy(){};

    public static Simplfy getInstance(){
        return INSTANCE;
    }
}
