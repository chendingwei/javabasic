package designpattern.Bridge;

public class ConcreteImpl implements Implementor {
    @Override
    public void OperateImpl() {
        System.out.println("具体实现化角色被访问");
    }
}
