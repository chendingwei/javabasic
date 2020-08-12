package interviewguide.list;

import java.util.Stack;

public class IsPalindrome1 {
    public class Node{
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public IsPalindrome1() {
        this.head = new Node(1);
    }

    public Node getHead() {
        return head;
    }

    public void add(int data){
        Node newNode = new Node(data);
        Node cur = head;
        while (cur.next!=null){
            cur = cur.next;
        }
        cur.next = newNode;
    }

    public boolean isPalindrome(){
        Stack<Node> stack = new Stack<>();
        Node cur = head;
        stack.push(cur);
        while (cur.next!=null){
            cur = cur.next;
            stack.push(cur);
        }
        cur = head;
        stack.pop();
        while (cur.next!=null){
            if(cur.data != stack.pop().data){
                return false;
            }
            cur = cur.next;
        }
        return true;
    }

    public void toPrint(){
        Node cur = head;
        StringBuilder str = new StringBuilder();
        while (cur.next!=null){
            str.append(cur.data+"-");
            cur = cur.next;
        }
        System.out.println(str);
    }
}
