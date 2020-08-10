package com.datastructure.linear.test;

import com.datastructure.linear.SequenceList;

public class SequenceTest {
    public static void main(String[] args) {
        SequenceList<String> sl = new SequenceList<>(3);

        sl.insert("cdw");
        sl.insert("lxw");
        sl.insert("ccf");
        sl.insert(0,"wsx");

        for (Object s : sl) {
            System.out.println(s);
        }
        System.out.println(sl.length());
        System.out.println("-----");
        String getRes = sl.get(0);
        System.out.println(getRes);

        String removeRes = sl.remove(0);
        System.out.println(removeRes);

        sl.clear();
        System.out.println(sl.length());


    }
}
