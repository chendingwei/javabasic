package designpattern.FactoryMethod;

public class Factory1 implements AbstractFactory{
    @Override
    public Product newProduct() {
        System.out.println("生产产品1");
        return new Product1();
    }
}
