package designpattern.Decorator;

public class ConcerteComponent implements Component {
    public ConcerteComponent() {
        System.out.println("创建具体构建角色");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法");
    }
}
