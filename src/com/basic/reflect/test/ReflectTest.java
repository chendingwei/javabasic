package com.basic.reflect.test;

import com.basic.reflect.Student;
import com.datastructure.stack.Stack;

public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<Student> c1 = Student.class;
        System.out.println(c1);

        Class<Student> c2 = Student.class;

        Student s = new Student();
        Class<? extends Student> c3 = s.getClass();
        System.out.println(c3==c1);

        Class<?> c4 = Class.forName("com.basic.reflect.Student");
        System.out.println(c1==c4);
    }
}
