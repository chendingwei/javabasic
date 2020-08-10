package com.basic.polimorphism.innerclass;
//外部类
public class Body {
//    内部类
    public class Heart{
//        内部类方法
        public void beat(){
            System.out.println("heart beats");
            System.out.println("my name is "+name);
        }
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Heart heart = new Heart();
    public void methodBH(){
        heart.beat();
    }
    //  外部类方法
    public void methodBody(){
        System.out.println("body method");
    }
}
