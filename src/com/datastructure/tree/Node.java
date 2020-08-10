package com.datastructure.tree;

public class Node<Key,Value> {
    public Node left;
    public Node right;
    public Key key;
    public Value value;

    public Node(Node left, Node right, Key key, Value value) {
        this.left = left;
        this.right = right;
        this.key = key;
        this.value = value;
    }
}
