package com.datastructure.linear;

import java.util.Iterator;

public class TwoWayLinkList<T> implements Iterable<T>{


    public class Node{
        private Node next;
        private Node pre;
        private T item;

        public Node(Node next, Node pre, T item) {
            this.next = next;
            this.pre = pre;
            this.item = item;
        }
    }

    private Node first;
    private Node last;
    private int N;

    public TwoWayLinkList(){
        this.first = new Node(last,null,null);
        this.last = null;
        this.N =0;
    }

    public void clear(){
        this.N=0;
        this.first.next = null;
        this.last = null;
    }

    public int length(){
        return this.N;
    }

    public boolean isEmpty(){
        return N==0;
    }

    public T getFirst(){
        if(isEmpty()){
            return null;
        }
        return (T)first.next.item;
    }

    public T getLast(){
        if(isEmpty()){
            return null;
        }
        return (T)last.item;
    }

    public void insert(T t){
        if(isEmpty()){
            Node newNode = new Node(null, first, t);
            last = newNode;
            first.next = last;
        }else{
            Node oldLast = last;
            Node newNode = new Node(null, oldLast, t);
            last.next = newNode;
            last = newNode;
        }
        N++;
    }

    public void insert(int i ,T t){
        Node pre = first;
        for(int index=0;index<i;index++){
            pre = pre.next;
        }
        Node cur = pre.next;
        Node newNode = new Node(cur, pre, t);
        pre.next = newNode;
        cur.pre = newNode;
        N++;
    }

    public T get(int i){
        Node n = first.next;
        for(int index=0;index<i;index++){
            n = n.next;
        }
        return n.item;
    }

    public int indexOf(T t){
        Node n = first.next;
        for(int index=0;n.item!=null;index++){
            if(n.item.equals(t)){
                return index;
            }
            n = n.next;
        }
        return -1;
    }

    public T remove(int i){
        Node n = first;
        for(int index=0;index<i;index++){
            n = n.next;
        }
        Node cur = n.next;
        Node nextNode = cur.next;
        n.next = nextNode;
        nextNode.pre = n;
        N--;
        return cur.item;
    }

    @Override
    public Iterator<T> iterator() {
        return new TIterator();
    }
    private class TIterator implements Iterator{
        private Node n;

        public TIterator() {
            this.n = first;
        }

        @Override
        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public Object next() {
            n = n.next;
            return n.item;
        }
    }
}
