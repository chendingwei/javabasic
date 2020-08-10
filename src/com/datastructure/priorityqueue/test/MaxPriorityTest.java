package com.datastructure.priorityqueue.test;

import com.datastructure.priorityqueue.MaxPriorityQueue;

public class MaxPriorityTest {
    public static void main(String[] args) {
        MaxPriorityQueue<String> queue = new MaxPriorityQueue<String>(10);
        queue.insert("A");
        queue.insert("B");
        queue.insert("C");
        queue.insert("D");
        queue.insert("E");
        queue.insert("F");
        queue.insert("G");

        while (!queue.isEmpty()){
            String max = queue.delMax();
            System.out.print(max+' ');
        }



    }
}
