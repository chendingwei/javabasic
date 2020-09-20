package writtenexamination.好未来;

public class ReverseList {
    public ListNode reverseList (ListNode head) {
        // write code here
        ListNode cur = head;
        ListNode pre = null;
        ListNode next = null;
        while (head.next != null){
            next = head.next;
            head.next = next.next;
            next.next = cur;
            cur = next;
        }
        head = cur;
        return head;
    }
}

class ListNode {
    int val;
    ListNode next = null;
}