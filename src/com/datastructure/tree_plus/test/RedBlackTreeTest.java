package com.datastructure.tree_plus.test;

import com.datastructure.tree_plus.RedBlackTree;

public class RedBlackTreeTest {

    public static void main(String[] args) {
        RedBlackTree<String, String> tree = new RedBlackTree<>();
        tree.put("1","cdw");
        tree.put("2","lxw");
        tree.put("3","ccf");

        String r1 = tree.get("1");
        System.out.println(r1);

        String r2 = tree.get("2");
        System.out.println(r2);

        String r3 = tree.get("3");
        System.out.println(r3);
    }
}
