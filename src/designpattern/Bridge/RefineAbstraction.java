package designpattern.Bridge;

public class RefineAbstraction extends Abstraction {
    public RefineAbstraction(Implementor imple) {
        super(imple);
    }

    @Override
    public void Operation() {
        System.out.println("扩展抽象化角色被访问");
        imple.OperateImpl();
    }
}
