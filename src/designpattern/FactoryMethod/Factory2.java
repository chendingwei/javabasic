package designpattern.FactoryMethod;

public class Factory2 implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("生产产品2");
        return new Product2();
    }
}
