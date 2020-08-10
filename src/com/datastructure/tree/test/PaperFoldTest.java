package com.datastructure.tree.test;

import com.datastructure.queue.Queue;

public class PaperFoldTest {
    public static void main(String[] args) {
        //模拟折纸过程，产生树
        Node<String> tree = createTree(2);
        printTree(tree);
        //遍历树，打印每个结点
    }
    private static class Node<T>{
        private T item;
        private Node left;
        private Node right;

        public Node(T item, Node left, Node right) {
            this.item = item;
            this.left = left;
            this.right = right;
        }
    }

    //通过对折多次纸
    public static Node<String> createTree(int N){
        Node<String> root =null;
        for (int i = 0; i < N; i++) {
            //当前为空树
            if(i==0){
                root = new Node("down",null,null);
                continue;
            }
            //不是空树
            //定义一个辅助队列，通过层序遍历的思想，找到叶子节点，给叶子添加子节点
            Queue<Node> queue = new Queue<>();
            queue.enqueue(root);
            while (!queue.isEmpty()){
                //从队列中弹出一个节点
                Node<String> tmp = queue.dequeue();
                //如果有左子结点，则把左子结点加入队列
                if(tmp.left!=null){
                    queue.enqueue(tmp.left);
                }
                //如果有右子节点，则把右子节点加入队列
                if(tmp.right!=null){
                    queue.enqueue(tmp.right);
                }
                if(tmp.left==null&&tmp.right==null){
                    tmp.left = new Node<String>("down",null,null);
                    tmp.right= new Node<String>("up",null,null);
                }
            }
        }
        return root;
    }

    //打印树
    public static void printTree(Node<String> root){
        //中序遍历进行输出
        if(root==null){
            return;
        }
        //打印左子树
        if(root.left!=null){
            printTree(root.left);
        }
        //打印根节点
        System.out.print(root.item+" ");
        //打印右子树
        if(root.right!=null){
            printTree(root.right);
        }

    }

}
