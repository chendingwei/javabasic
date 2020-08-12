package interviewguide.list;

import java.util.Stack;

public class AddList {
    public static void addList(Node head1, Node head2){
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Node cur1 = head1;
        Node cur2 = head2;
        stack1.push(cur1.getData());
        stack2.push(cur2.getData());
        while (cur1.getNext()!=null){
            cur1 = cur1.getNext();
            stack1.push(cur1.getData());
        }

        while (cur2.getNext()!=null){
            cur2 = cur2.getNext();
            stack2.push(cur2.getData());
        }

        int res = 0;
        int times = 1;
        while (!stack1.empty() || !stack2.empty()){
            res += (stack1.empty()?0:stack1.pop())*times;
            res += (stack2.empty()?0:stack2.pop())*times;
            times = times*10;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.setNext(new Node(2));
        head1.getNext().setNext(new Node(3));

        Node head2 = new Node(2);
        head2.setNext(new Node(5));

        addList(head1,head2);
    }

}
