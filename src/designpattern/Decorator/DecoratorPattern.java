package designpattern.Decorator;

public class DecoratorPattern {
    public static void main(String[] args) {
        Component com = new ConcerteComponent();
        com.operation();
        System.out.println("---------------------");
        Component c = new ConcreteDecorator(com);
        c.operation();
    }
}
