package com.basic.reflect;

public class Student {
    private String name;
    public int age;
    public String address;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    private void function(){
        System.out.println("function");
    }
    public void method1(){
        System.out.println("method");
    }
    public void method2(){
        System.out.println("method2");
    }

    public String method3(String s,int i){
        return s+" "+i;
    }

    public String toString(){
        return "Student{" +
                "name="+name+
                ",age="+age +
                ",address="+address+
                "}";
    }

}
