package com.datastructure.symboltable;

public class SymbolTable<Key,Value> {
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

    public SymbolTable(){
        this.head = new Node(null,null,null);
        this.N = 0;
    }

    public int size(){
        return N;

    }

    public void put(Key key,Value value){
        //若存在key为key的键值对，则找到对应key，用新value替换旧value
        Node n = head;
        while(n.next!=null){
            n = n.next;
            if(n.key.equals(key)){
                n.value = value;
                return;
            }
        }
        //若不存在key的键值对，则创建新的节点
        Node<Key, Value> newNode = new Node<>(key, value, null);
        Node oldFirst = head.next;
        newNode.next = oldFirst;
        head.next = newNode;
        N++;
        // 元素个数+1
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
