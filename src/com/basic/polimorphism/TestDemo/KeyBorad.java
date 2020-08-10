package com.basic.polimorphism.TestDemo;

public class KeyBorad implements USBInterface{
    @Override
    public void powerOn() {
        System.out.println("keyborad is activate");
    }

    @Override
    public void powerOff() {
        System.out.println("keyborad is unactivate");
    }
    public void type(){
        System.out.println("keyboard type");
    }
}
