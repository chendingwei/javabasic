package com.datastructure.tree.test;

import com.datastructure.tree.BinaryTree;

public class BinaryTreeTest {
    public static void main(String[] args) {
        //创建树
        BinaryTree<Integer, String> tree = new BinaryTree<>();
        tree.put(1,"cdw");
        tree.put(2,"lxw");
        tree.put(3,"wsx");
        tree.put(4,"ccf");
        System.out.println(tree.size());

        System.out.println(tree.get(2));

        tree.delete(3);
        System.out.println(tree.size());
        System.out.println(tree.get(3));

    }
}
