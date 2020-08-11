package interviewguide.list;

public class RemoveNode {
    public class Node{
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head;

    public RemoveNode() {
        this.head = new Node(0,null);
    }

    public void add(int data){
        Node newNode = new Node(data, null);
        Node cur = head;
        while (cur.next!=null){
            cur = cur.next;
        }
        cur.next = newNode;
    }

    public void remove(int index) {
        Node pre = null;
        Node cur = head;
        if(index ==0){
            head = head.next;
            return;
        }
        for (int i = 0; i < index-1; i++) {
            if (cur.next == null) {
                return;
            }
            pre = cur;
            cur = cur.next;
        }
        pre.next = cur.next;
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
