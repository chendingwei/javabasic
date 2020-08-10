package com.datastructure.stack;

import java.util.Iterator;

public class Stack<T> implements Iterable<T>{
    private static class Node<T>{
        private T item;
        private Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    private Node head;
    private int N;

    public Stack(){
        this.head=new Node(null,null);
        this.N =0;
    }

    public boolean isEmpty(){
        return N==0;
    }

    public int size(){
        return N;
    }

    public void push(T t){
        Node pre = head.next;
        Node<T> newNode = new Node<>(t, null);
        head.next = newNode;
        newNode.next = pre;
        N++;
    }

    public T pop(){
        Node pre = head.next;
        if(pre==null){
            return null;
        }
        head.next = pre.next;
        N--;
        return (T)pre.item;
    }

    @Override
    public Iterator iterator() {
        return new SInterator();
    }
    private class SInterator implements Iterator{
        private Node n;

        public SInterator() {
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
