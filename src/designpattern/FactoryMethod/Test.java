package designpattern.FactoryMethod;

public class Test {
    public static void main(String[] args) {
        Factory1 f1 = new Factory1();
        f1.newProduct().show();
        Factory2 f2 = new Factory2();
        f2.newProduct().show();
    }
}
