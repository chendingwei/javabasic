package designpattern.Build;

public class Test {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director dic = new Director(builder);
        Product product = dic.construct();
        product.show();
    }
}
