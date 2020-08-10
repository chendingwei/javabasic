package com.recite.linear;

import java.util.Iterator;

public class TwoWayLinkList<T> implements Iterable<T> {
    private Node head;
    private Node last;
    private int N;

    public TwoWayLinkList() {
        this.head = new Node(null,null,last);
        this.last = new Node(null,head,null);
        this.N = 0;
    }

    public void clear(){
        this.head.next = null;
        this.last.pre = null;
        this.N =0;
    }

    public boolean isEmpty(){
        return N==0;
    }

    public int length(){
        return N;
    }

    public T get(int i){
        Node n = head.next;
        for(int index=0;index<i;index++){
            n = n.next;
        }
        return (T)n.item;
    }

    public void insert(T t) {
        Node oldLast = last;
        Node newNode = new Node(t,null,oldLast);
        oldLast.next = newNode;
        last = newNode;
        N++;
    }

    public void insert(T t,int i){
        Node pre = head;
        for(int index=0;index<i;index++){
            pre = pre.next;
        }
        Node cur = pre.next;
        Node newNode = new Node(t,pre,cur);
        cur.pre = newNode;
        pre.next = newNode;
        N++;
    }

    private class Node<T> {
        private T item;
        private Node pre;
        private Node next;

        public Node(T item, Node pre, Node next) {
            this.item = item;
            this.pre = pre;
            this.next = next;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new TIerator<T>();
    }

    private class TIerator<T> implements Iterator<T> {
        private Node n;

        public TIerator() {
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
