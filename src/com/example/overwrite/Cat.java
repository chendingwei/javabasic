package com.example.overwrite;

public class Cat extends Animal{
    private String name;
    private int age;
    private String behaver;
    public Cat(String name, int age) {
        super(name, age);
        this.behaver = "eat fish";
    }
}
