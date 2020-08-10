package com.datastructure.queue;

import java.util.Iterator;

public class Queue<T> implements Iterable<T>{
    private class Node<T>{
        private T item;
        private Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    private Node head;
    private int N;
    private Node last;

    public Queue(){
        this.head = new Node(null,null);
        this.N=0;
        this.last = null;
    }

    public boolean isEmpty(){
        return N==0;
    }

    public int size(){
        return N;
    }

    public void enqueue(T t){
        if(last==null){
            last = new Node(t,null);
            head.next = last;
        }else {
            Node oldLast = last;
            //为什么声明了Node之后会出错？
            //重新声明之后，last的内存地址变了，指向也发生了变化。
            last = new Node(t, null);
            oldLast.next=last;
        }
        N++;
    }

//    public void enqueue(T t){
//
//        if (last==null){
//            //当前尾结点last为null
//            last= new Node(t,null);
//            head.next=last;
//        }else {
//            //当前尾结点last不为null
//            Node oldLast = last;
//            last = new Node(t, null);
//            oldLast.next=last;
//        }
//
//        //元素个数+1
//        N++;
//    }

    public T dequeue(){
        if(isEmpty()){
            return null;
        }
        Node oldFirst = head.next;
        head.next = oldFirst.next;
        N--;
        if(isEmpty()){
            last = null;
        }
        return (T)oldFirst.item;
    }

    @Override
    public Iterator<T> iterator() {
        return new QIterator();
    }

    private class QIterator implements Iterator{
        private Node n;

        public QIterator() {
            this.n = head;
        }

        @Override
        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public T next() {
            n = n.next;
            return (T)n.item;
        }
    }
}
