package com.datastructure.sort.test;

import com.datastructure.sort.Student;

// 2.定义测试类Test，在测试类Test中定义测试方法Comparable getMax(Comparable c1,Comparable c2)完成测试
public class TestComparable {
    public static Comparable getMax(Comparable c1,Comparable c2){
        int res = c1.compareTo(c2);
        if(res>=0){
            return c1;
        }else{
            return c2;
        }
    }

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("cdw");
        stu1.setAge(18);
        Student stu2 = new Student();
        stu2.setName("lxw");
        stu2.setAge(16);

        Comparable max = getMax(stu1, stu2);
        System.out.println(max);

    }
}
