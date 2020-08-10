package com.datastructure.tree;


import com.datastructure.queue.Queue;

public class BinaryTree<Key extends Comparable<Key>, Value> {
    private Node root;
    private int N;

    public int size(){
        return N;
    }

    public void put(Key key,Value value){
        root = put(root, key, value);
    }

    public Node put(Node x,Key key, Value value){
        //若x子树为空。
        if(x ==null){
            N++;
            return new Node(null,null,key,value);
        }
        //若x子树不为空。
        //比较x节点的key和传入key的大小
        int cmp = key.compareTo((Key) x.key);
        if(cmp>0){
            //若传入key大于x的key，则继续找x的右子树
            x.right = put(x.right, key, value);
        }else if(cmp<0){
            //若传入key小于x的key，则继续找x的左子树
            x.left = put(x.left,key,value);
        }else {
            //若传入key等于x的key，则替换x的value
            x.value = value;
        }
        return x;
    }

    public Value get(Key key){
        return get(root,key);
    }

    public Value get(Node x,Key key){
        //若x子树为空。
        if(x ==null){
            return null;
        }
        //若x子树不为空。
        //比较x节点的key和传入key的大小
        int cmp = key.compareTo((Key) x.key);
        if(cmp>0){
            //若传入key大于x的key，则继续找x的右子树
            return get(x.right, key);
        }else if(cmp<0){
            //若传入key小于x的key，则继续找x的左子树
            return get(x.left, key);
        }else {
            //若传入key等于x的key，则替换x的value
            return (Value)x.value;
        }
    }

    public void delete(Key key){
        delete(root,key);
    }

    public Node delete(Node x,Key key){
        //x树为空
        if(x==null){
            return null;
        }
        //x树不为空
        int cmp = key.compareTo((Key) x.key);
        if(cmp>0){
            //若传入key大于x的key，则继续找x的右子树
            x.right = delete(x.right, key);
        }else if(cmp<0){
            //若传入key小于x的key，则继续找x的左子树
            x.left = delete(x.left,key);
        }else {
            N--;
            //若传入key等于x的key，删除操作
            //删除节点没有右子树
            if(x.right ==null){
                return x.left;
            }
            //删除节点没有左子树
            if(x.left ==null){
                return x.right;
            }

            Node minNode = x.right;
            while(minNode.left!=null){
                minNode = minNode.left;
            }
            //删除右子树中最小的节点
            Node n = x.right;
            while (n.left != null){
                if(n.left.left==null){
                    n.left =null;
                }else{
                    n = n.left;
                }
            }
            // 让x节点的左子树成为minnode的左子树
            minNode.left = x.left;
            // 让x节点的右子树成为minnode的右子树
            minNode.right = x.right;
            // 让x节点的父子树成为minnode的父子树
            x = minNode;

        }

        return x;

    }

    public Key min(){
        return (Key) min(root).key;
    }

    public Node min(Node x) {
        while(x.left!=null) {
            x = x.left;
        }
        return x;
    }

    public Key max(){
        return (Key)max(root).key;
    }

    public Node max(Node x){
        while(x.right!=null){
            x =x.right;
        }
        return x;
    }

    //获取所有键
    public Queue<Key> preErgodic(){
        Queue<Key> keys = new Queue<>();
        preErgodic(root,keys);
        return keys;
    }

    private void preErgodic(Node x,Queue<Key> keys){
        //先序遍历，先根节点，后左子树，最后右子树
        if(x ==null){
            return;
        }
        keys.enqueue((Key)x.key);
        if(x.left!=null){
            preErgodic(x.left,keys);
        }
        if(x.right!=null){
            preErgodic(x.right,keys);
        }

    }

    public Queue<Key> midErgodic(){
        Queue<Key> keys = new Queue<>();
        midErgodic(root,keys);
        return keys;
    }

    public void midErgodic(Node x,Queue<Key> keys){
        if(x==null){
            return;
        }
        if(x.left!=null){
            midErgodic(x.left,keys);
        }
        keys.enqueue((Key)x.key);
        if(x.right!=null){
            midErgodic(x.right,keys);
        }

    }

    public Queue<Key> afterErgodic(){
        Queue<Key> keys = new Queue<>();
        afterErgodic(root,keys);
        return keys;
    }

    public void afterErgodic(Node x,Queue<Key> keys){
        if(x==null){
            return;
        }
        if(x.left!=null) {
            afterErgodic(x.left, keys);
        }
        if(x.right!=null){
            afterErgodic(x.right,keys);
        }

        keys.enqueue((Key)x.key);
    }

    public Queue<Key> layerErgodic(){
        Queue<Key> keys = new Queue<>();
        Queue<Node> nodes = new Queue<>();
        nodes.enqueue(root);
        while (!nodes.isEmpty()){
            Node n = nodes.dequeue();
            keys.enqueue((Key) n.key);
            if(n.left!=null){
                nodes.enqueue(n.left);
            }
            if(n.right!=null){
                nodes.enqueue(n.right);
            }
        }
        return keys;
    }

    public void layerErgodic(Node x,Queue<Key> keys){

    }

    public int maxDepth(){
        return maxDepth(root);
    }

    private int maxDepth(Node x) {
        if(x==null){
            return 0;
        }
        int max=0;
        int maxL=0;
        int maxR=0;

        if(x.left!=null){
            maxL = maxDepth(x.left);
        }
        if(x.right!=null){
            maxR = maxDepth(x.right);
        }
        max = maxL>maxR?maxL+1:maxR+1;

        return max;
    }
}
