package interviewguide.list;

public class MergeList {
    public static Node merge(Node head1, Node head2){
        Node res = head1.data < head2.data ? head1 : head2;
        Node cur1 = res == head1 ? head1 : head2;
        Node cur2 = res == head1 ? head2 : head1;
        Node pre = null;
        Node next = null;

        while (cur1 != null && cur2 != null){
            if(cur1.data < cur2.data){
                pre = cur1;
                cur1 = cur1.next;
            }else {
                next = cur2.next;
                pre.next = cur2;
                cur2.next = cur1;
                pre = cur2;
                cur2 = cur2.next;
            }
        }
        return res;
    }
}
