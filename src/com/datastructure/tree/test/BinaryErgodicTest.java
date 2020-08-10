package com.datastructure.tree.test;

import com.datastructure.queue.Queue;
import com.datastructure.tree.BinaryTree;

public class BinaryErgodicTest {
    public static void main(String[] args) {
        BinaryTree<String, String> btree = new BinaryTree<>();
        btree.put("E", "5");
        btree.put("B", "2");
        btree.put("G", "7");
        btree.put("A", "1");
        btree.put("D", "4");
        btree.put("F", "6");
        btree.put("H", "8");
        btree.put("C", "3");

        int max = btree.maxDepth();
        System.out.println(max);
//        Queue<String> keys = btree.preErgodic();
//        Queue<String> keys = btree.midErgodic();
//        Queue<String> keys = btree.afterErgodic();
//        Queue<String> keys = btree.layerErgodic();
//        for (String key : keys) {
//            String s = btree.get(key);
//            System.out.println(key+"----"+s);
//        }
    }
}
