package designpattern.Bridge;

public abstract class Abstraction {
    public Implementor imple;

    public Abstraction(Implementor imple) {
        this.imple = imple;
    }

    public abstract void Operation();
}
