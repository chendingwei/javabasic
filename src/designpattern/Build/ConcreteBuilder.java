package designpattern.Build;

public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("构造partA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("构造partB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("构造partC");
    }
}
