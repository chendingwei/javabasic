package com.datastructure.priorityqueue.test;

import com.datastructure.priorityqueue.MinPrioriQueue;

public class MinPrioriTest {
    public static void main(String[] args) {
        MinPrioriQueue<String> queue = new MinPrioriQueue<>(10);

        queue.insert("G");
        queue.insert("F");
        queue.insert("E");
        queue.insert("D");
        queue.insert("C");
        queue.insert("B");
        queue.insert("A");


        while (!queue.isEmpty()){
            String s = queue.delMin();
            System.out.print(s);
        }


    }
}
