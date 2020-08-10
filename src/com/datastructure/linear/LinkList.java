package com.datastructure.linear;

import java.util.Iterator;

public class LinkList<T> implements Iterable<T>{
    public class Node<T>{
        public T item;
        public Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    private Node head;
    private int N;

    public LinkList(){
        head = new Node(null,null);
        N =0;
    }

    public void clear(){
        this.head.next = null;
        N = 0;
    }

    public int length(){
        return N;
    }

    public boolean isEmpty(){
        return (N ==0);
    }

    public T get(int i){
        Node n = head.next;
        for(int index=0;index<i;i++){
            n=n.next;
        }
        return (T)n.item;
    }

    public void insert(T t){
        Node n = head;
        while (n.next != null){
            n = n.next;
        }
        Node<T> newNode = new Node<>(t, null);
        n.next = newNode;
        N++;
    }

    public void insert(int i, T t){
        Node pre =head;
        for(int index=0;index<i-1;index++){
            pre = pre.next;
        }
        Node curr = pre.next;
        Node newNode = new Node(t, curr);
        pre.next = newNode;
        N++;
    }

    public T remove(int i){
        Node n = head;
        for(int index=0;index<i-1;index++){
            n = n.next;
        }
        Node curr = n.next;
        Node nextNode = curr.next;
        n.next = nextNode;
        N--;
        return (T)curr.item;
    }

    public int indexOf(T t){
        Node n = head;
        for(int index=0;n.next!=null;index++){
            n = n.next;
            if(n.item.equals(t)){
                return index;
            }
        }
        return -1;
    }

    public void reverse(){
        if(isEmpty()){
            return;
        }
        Node n = head.next;
        reverse(n);
    }

    public Node reverse(Node cur){
        if(cur.next == null){
            head.next=cur;
            return cur;
        }
        Node pre = reverse(cur.next);
        pre.next=cur;
        cur.next=null;
        return cur;
    }


    @Override
    public Iterator<T> iterator() {
        return new LIterator();
    }

    private class LIterator implements Iterator{
        private Node n;
        public LIterator(){
            this.n = head;
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
