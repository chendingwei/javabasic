package com.datastructure.linear.test;

import com.datastructure.linear.LinkList;
import com.datastructure.linear.TwoWayLinkList;

public class TwoWayLinkTest {
    public static void main(String[] args) {
        TwoWayLinkList<String> sl = new TwoWayLinkList<>();

        sl.insert("cdw");
        sl.insert("lxw");
        sl.insert("ccf");
//        sl.insert(0,"wsx");
        for (Object s : sl) {
            System.out.println(s);
        }
        System.out.println("--------");
        System.out.println(sl.getFirst());
        System.out.println(sl.getLast());
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
