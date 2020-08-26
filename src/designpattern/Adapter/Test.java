package designpattern.Adapter;



public class Test {
    public static void main(String[] args) {
        System.out.println("适配器测试");
        TargetImp tar = new Adapter();
        tar.request();
    }
}
