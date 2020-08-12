package interviewguide.list;

import java.util.LinkedList;

public class ReverseList {
    public class Node{
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head;

    public ReverseList() {
        this.head = new Node(1,null);
    }

    public void add(int data){
        Node newNode = new Node(data, null);
        Node cur = head;
        while (cur.next!=null){
            cur = cur.next;
        }
        cur.next = newNode;
    }

    public void reverse(){
        Node cur = head;
        Node pre = null;
        Node next = null;
        while (head.next != null){
            next = head.next;
            head.next = next.next;
            next.next = cur;
            cur = next;
        }
        head = cur;
    }

    public Node getHead() {
        return head;
    }

    public void toPrint(){
        Node cur = head;
        while (cur!=null){
            System.out.print(cur.data + "-");
            cur = cur.next;
        }
        System.out.println();
    }

}

