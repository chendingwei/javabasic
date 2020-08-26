package designpattern.Proxy;

public class Proxy implements Subject {
    private RealSubject realSubject;
    @Override
    public void Request() {
        if(realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.Request();
    }
}
