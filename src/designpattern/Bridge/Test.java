package designpattern.Bridge;

public class Test {
    public static void main(String[] args) {
        Implementor imple = new ConcreteImpl();
        Abstraction abs = new RefineAbstraction(imple);
        abs.Operation();
    }
}
