package com.basic.polimorphism.instance;

public class InstanceofDemo {
    public static void main(String[] args) {
        Animal animal = new Dog();
//        animal.eat();
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.eat();
        }
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.eat();
        }
    }
}
