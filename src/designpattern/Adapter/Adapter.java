package designpattern.Adapter;

public class Adapter extends Adaptee implements TargetImp {
    @Override
    public void request() {
        specificRequest();
    }
}
