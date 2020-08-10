package com.basic.polimorphism.attr;

public class MultiField {
    public static void main(String[] args) {
        Parent obj = new Son();
        System.out.println(obj.num);
        System.out.println(((Son) obj).num);
    }
}
