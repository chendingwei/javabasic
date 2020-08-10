package com.recite.linear;

import java.util.Iterator;

public class LinkList<T> implements Iterable<T>{

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

    public LinkList() {
        this.head = new Node(null,null);
        this.N = 0;
    }

    public void clear(){
        N=0;
        head.next =null;
    }

    public boolean isEmpty(){
        return N==0;
    }

    public int length(){
        return N;
    }

    public T get(int i) {
        Node newNode = head.next;
        for(int index=0;index<i;index++){
            newNode = newNode.next;
        }
        return (T)newNode.item;
    }

    public void insert(T t){
        Node n = head;
        Node newNode = new Node(t, null);
        while (n.next!=null){
            n = n.next;
        }
        n.next = newNode;
        N++;
    }

    public void insert(T t,int i){
        Node pre =head;
        for(int index=0;index<i-1;index++){
            pre = pre.next;
        }
        Node cur = pre.next;
        Node newNode = new Node(t, cur);
        pre.next = newNode;
        N++;
    }

    public T remove(int i){
        Node pre =head;
        for(int index =0;index<i;index++){
            pre = pre.next;
        }
        Node cur = pre.next;
        pre.next = cur.next;
        N--;
        return (T)cur.item;
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


    @Override
    public Iterator iterator() {
        return new LIterator();
    }

    private class LIterator implements Iterator<T>{

        private Node n;

        public LIterator() {
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
    public static void main(String[] args) {
        LinkList<String> newLink = new LinkList<>();
        newLink.insert("cdw");
        newLink.insert("lxw");
        newLink.insert("ccf");
        newLink.insert("wsx",0);

        for(Object s:newLink){
            System.out.print(s);
        }

        String remove = newLink.remove(0);
        System.out.println(remove);

        for(Object s:newLink){
            System.out.print(s);
        }
    }


}
