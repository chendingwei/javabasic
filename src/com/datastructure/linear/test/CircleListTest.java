package com.datastructure.linear.test;

public class CircleListTest {
    public static void main(String[] args) {
        Node<String> first = new Node<String>("aa", null);
        Node<String> second = new Node<String>("bb", null);
        Node<String> third = new Node<String>("cc", null);
        Node<String> fourth = new Node<String>("dd", null);
        Node<String> fifth = new Node<String>("ee", null);
        Node<String> six = new Node<String>("ff", null);
//        Node<String> seven = new Node<String>("gg", null);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=six;
//        six.next=seven;

//        six.next = third;
//        seven.next=third;

        boolean circle = isCircle(first);
        System.out.println(circle);

//        String mid = getMid(first);
//        System.out.println(mid);
    }

    public static boolean isCircle(Node first){
        Node<String> fast = first;
        Node<String> slow = first;

        while (fast!=null&& fast.next!=null){
                if(fast.next.next ==null) {
                    return false;
                }
            fast = fast.next.next;
            slow = slow.next;
            if(fast.equals(slow)){
                return true;
            }
        }
        return false;

    }

    private static class Node<T>{
        private T item;
        private Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

}
