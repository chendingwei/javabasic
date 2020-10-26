package leetcode.linklist;

public class DeleteNode {
    public ListNode deleteNode(ListNode head, int val){
        ListNode cur = head;
        ListNode pre = null;
        while (cur.val != val){
            pre = cur;
            cur = cur.next;
        }

        if(cur == head){
            return cur.next;
        }

        pre.next = cur.next;
        return head;
    }
}


class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
