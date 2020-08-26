package designpattern.Decorator;

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void operation(){
        super.operation();
        addOperation();
    }

    public void addOperation(){
        System.out.println("为具体构件角色增加额外功能");
    }
}
