package com.basic.polimorphism.TestDemo;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
        USBInterface mouse = new Mouse();
        USBInterface kb = new KeyBorad();
        computer.useDevice(mouse);
        computer.useDevice(kb);
        computer.powerOff();
    }
}
