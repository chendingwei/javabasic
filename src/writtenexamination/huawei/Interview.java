package writtenexamination.huawei;

import java.util.LinkedList;

/*
反转链表
 */
public class Interview {
    public static void main(String[] args) {
        Node root = new Node(1, null);
        Node cur = root;
        for (int i = 2; i <= 5; i++) {
            cur = cur.next;
            cur = new Node(2,null);
        }

        Node newRoot = cur;
        while (cur != root) {
            Node newNode = root;
            while (newNode.next != cur) {
                newNode = newNode.next;
            }
            cur.next = newNode;
            cur = newNode;
        }
    }
}

class Node{
    public int val;
    public Node next;

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

}
