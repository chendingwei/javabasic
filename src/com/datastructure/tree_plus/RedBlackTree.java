package com.datastructure.tree_plus;

public class RedBlackTree<Key extends Comparable<Key>,Value> {
    private class Node<Key,Value>{
        public Key key;
        public Value value;
        public Node left;
        public Node right;
        public boolean color;

        public Node(Key key, Value value, Node left, Node right, boolean color) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
            this.color = color;
        }
    }
    private Node root;
    private int N;
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    public int size(){
        return N;
    }

    private boolean isRed(Node x){
        if(x == null){
            return false;
        }
        return x.color == RED;
    }

    private Node rotateLeft(Node h){
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;

        return x;
    }

    private Node rotateRight(Node h){
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = RED;

        return x;
    }

    private void flipColors(Node h){
        h.color = RED;
        h.left.color = BLACK;
        h.right.color = BLACK;
    }

    public void put(Key key,Value value) {
        root = put(root, key, value);
        root.color = BLACK;
    }

    public Node put(Node h,Key key,Value value){
        if(h == null){
            N++;
            return new Node(key,value,null,null,RED);
        }

        int cmp =key.compareTo((Key) h.key);
        if(cmp<0){
            h.left = put(h.left,key,value);
        }else if(cmp>0){
            h.right = put(h.right,key,value);
        }else{
            h.value = value;
        }

        //左旋：当前节点h的左子结点为黑色，右子节点为红色
        if(isRed(h.right) && !isRed(h.left)){
            h = rotateLeft(h);
        }
        //右旋：当前节点h的左子结点和左子结点的左子结点都为红色
        if(isRed(h.left) && isRed(h.left.left)){
            h = rotateRight(h);
        }
        //颜色反转：当前节点的左子结点和右子节点都为红色
        if(isRed(h.left) && isRed(h.right)){
            flipColors(h);
        }

        return h;
    }

    public Value get(Key key){
        return get(root,key);
    }

    public Value get(Node h,Key key){
        if(h==null){
            return null;
        }
        int cmp = key.compareTo((Key) h.key);

        if(cmp<0){
            return (Value) get(h.left,key);
        }else if(cmp>0){
            return (Value) get(h.right,key);
        }else {
            return (Value) h.value;
        }

    }
}
