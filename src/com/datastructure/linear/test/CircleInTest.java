package com.datastructure.linear.test;

public class CircleInTest {
    public static void main(String[] args) {
        Node<String> first = new Node<String>("aa", null);
        Node<String> second = new Node<String>("bb", null);
        Node<String> third = new Node<String>("cc", null);
        Node<String> fourth = new Node<String>("dd", null);
        Node<String> fifth = new Node<String>("ee", null);
        Node<String> six = new Node<String>("ff", null);
        Node<String> seven = new Node<String>("gg", null);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=six;
        six.next=seven;

//        six.next = third;
        seven.next=third;

        Node node = getEntrance(first);
        System.out.println(node.item);

//        String mid = getMid(first);
//        System.out.println(mid);
    }

    public static Node getEntrance(Node first){
        Node<String> fast = first;
        Node<String> slow = first;
        Node<String> temp = null;

        while (fast!=null && fast.next!=null){
            if(fast.next.next==null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            if(fast.equals(slow)){
                temp = first;
                continue;
            }
            if(temp!=null){
                temp = temp.next;
                if(temp.equals(slow)){
                    break;
                }
            }
        }
        return temp;

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
