package designpattern.prototype;

public class proto implements Cloneable{
    public proto() {
        System.out.println("创建成功");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("复制成功");
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        proto proto = new proto();
        designpattern.prototype.proto clone = (proto) proto.clone();
        System.out.println(clone == proto);
    }
}
