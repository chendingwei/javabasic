package com.datastructure.linear.test;

public class JosephTest {
    public static void main(String[] args) {
        Node<Integer> first = null;
        Node<Integer> pre =null;
        //构建循环链表
        for(int i =1;i<=41;i++){
            if(i==1){
                first = new Node<>(i,null);
                pre = first;
                continue;
            }
            Node<Integer> cur = new Node<>(i, null);
            pre.next = cur;
            pre = cur;
            if(i==41){
                pre.next=first;
            }
        }
        int count=0;
        //记录当前节点
        Node<Integer> now = first;
        //记录当前节点的上一个节点
        Node<Integer> bef = null;
        while(now!=now.next){
            count++;
            if(count==3){
                bef.next = now.next;
                System.out.println(now.item+",");
                count=0;
                now = now.next;
            }else{
                bef = now;
                now = now.next;
            }
        }
        System.out.println(now.item);

    }
    private static class Node<T>{
        private T item;
        private Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
}
