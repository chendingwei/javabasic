package 剑指offer.list;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class ReverseList {
    public int[] reversePrint(ListNode head) {
        if(head ==null){
            return new int[0];
        }
        ListNode cur = head;
        ListNode next = null;
        Deque<Integer> queue = new ArrayDeque<>();
        queue.addLast(cur.val);
        while(head.next != null){
            next = head.next;
            head.next = next.next;
            next.next = cur;
            cur = next;
            queue.addFirst(cur.val);
        }
        int[] res = queue.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }

    public int[] reversePrint2(ListNode head) {
        LinkedList<ListNode> list = new LinkedList<>();
        while (head !=null){
            list.addLast(head);
            head = head.next;
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.removeLast().val;
        }
        return res;
    }

}
