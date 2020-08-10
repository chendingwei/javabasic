package com.basic.reflect.test;

import com.basic.reflect.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectBulider {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Student> c1 = Student.class;
        Constructor<?>[] constructors = c1.getConstructors();
        for (Constructor<?> con : constructors) {
            System.out.println(con);
        }

        Constructor<?>[] declaredConstructors = c1.getDeclaredConstructors();
        for (Constructor<?> decon : declaredConstructors) {
            System.out.println(decon);
        }

        Constructor<Student> con = c1.getConstructor();
        Student student = con.newInstance();
        System.out.println(student);
    }
}
