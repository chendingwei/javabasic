package leetcode.linklist;

/*
109.有序链表转换二叉搜索树

给定一个单链表，其中的元素按升序排序，将其转换为高度平衡的二叉搜索树。

本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。

示例:

给定的有序链表： [-10, -3, 0, 5, 9],

一个可能的答案是：[0, -3, 9, -10, null, 5], 它可以表示下面这个高度平衡二叉搜索树：

      0
     / \
   -3   9
   /   /
 -10  5

 */

public class LinkListToBTree {
     public class TreeNode {
        int val;
        TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
             this.right = right;
         }
     }
     public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
     }

    public TreeNode sortedListToBST(ListNode head) {
        return dfs(head, null);
    }

    public TreeNode dfs(ListNode left, ListNode right){
        if(left == right){
            return null;
        }

        ListNode cur = getMid(left,right);

        TreeNode root = new TreeNode(cur.val);
        root.left = dfs(left, cur);
        root.right = dfs(cur.next,right);
        return root;
    }


    public ListNode getMid(ListNode left, ListNode right){
        ListNode slow = left;
        ListNode fast = left;
        while(fast!= right && fast.next != right){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

