package com.datastructure.queue.test;

import com.datastructure.queue.Queue;
import com.datastructure.queue.QueueTry;

public class QueueTest {
    public static void main(String[] args) {
//        QueueTry<String> queue = new QueueTry<>();
        Queue<String> queue = new Queue<String>();
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        queue.enqueue("d");

        for (String s : queue) {
            System.out.println(s);
        }
        System.out.println("----");
        String dequeue = queue.dequeue();
        System.out.println("out queue " + dequeue);
        System.out.println("queue size is " + queue.size());

    }

}
