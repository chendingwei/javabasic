package com.basic.polimorphism.TestDemo;

public class Mouse implements USBInterface{
    @Override
    public void powerOn() {
        System.out.println("mouse is activate");
    }

    @Override
    public void powerOff() {
        System.out.println("mouse is unactivate");
    }
    public void click(){
        System.out.println("click mouse");
    }
}
