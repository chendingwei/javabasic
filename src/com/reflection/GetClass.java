package com.reflection;

public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("这个人是" + person.name);
//        一、通过对象获得
        Class<? extends Person> c1 = person.getClass();

//        二、forname获得
        Class<?> c2 = Class.forName("com.reflection.Student");
//        三、通过类名获得
        Class<Student> c3 = Student.class;
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());

//        四、基本内置类型的包装类都有一个Type属性，用于获得Class对象
        Class<Integer> type = Integer.TYPE;

//        获取父类的Class对象
        Class<?> c4 = c1.getSuperclass();
        System.out.println(c4);
    }
}

class Person{
    public String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person{
    public Student(){
        this.name = "学生";
    }
}

class Teacher extends Person{
    public Teacher() {
        this.name = "老师";
    }
}