package com.basic.polimorphism.TestDemo;

public class Computer {
    public void powerOn(){
        System.out.println("computer is power on");
    }
    public void powerOff(){
        System.out.println("computer is power off");
    }
    public void useDevice(USBInterface usb){
        usb.powerOn();
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();

        }
        if(usb instanceof KeyBorad){
            KeyBorad kb = (KeyBorad) usb;
            kb.type();
        }
        usb.powerOff();
    }
}
