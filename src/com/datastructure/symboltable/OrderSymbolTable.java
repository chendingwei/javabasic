package com.datastructure.symboltable;

public class OrderSymbolTable<Key extends Comparable<Key>,Value> {
    private class Node<Key,Value>{
        private Key key;
        private Value value;
        private Node next;

        public Node(Key key, Value value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
    private Node head;
    private int N;

    public OrderSymbolTable(){
        this.head = new Node(null,null,null);
        this.N = 0;
    }

    public int size(){
        return N;

    }

    public void put(Key key,Value value){

        Node pre = head;
        Node cur = head.next;
        while (cur!=null &&key.compareTo((Key) cur.key)>0){
            pre = cur;
            cur = cur.next;
        }
        // Key 已存在
        if(cur!=null &&key.compareTo((Key)cur.key)==0){
            cur.value = value;
            return;
        }
        // Key不存在
        Node newNode = new Node(key, value, cur);
        pre.next = newNode;
        N++;
    }

    public void delete(Key key){
        Node n = head;
        while (n.next!=null){
            if(n.next.key.equals(key)){
                n.next = n.next.next;
                N--;
                return;
            }
            n = n.next;
        }
    }

    public Value get(Key key){
        Node n = head;
        while (n.next!=null) {
            n = n.next;
            if (n.key.equals(key)) {
                return (Value) n.value;
            }
        }
        return null;
    }
}
