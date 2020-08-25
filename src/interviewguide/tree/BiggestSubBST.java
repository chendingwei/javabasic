package interviewguide.tree;

public class BiggestSubBST {
    public static TreeNode biggestSubBst(TreeNode root){
        int[] record = new int[3];
        TreeNode head = posOrder(root, record);
        return head;
    }

    public static TreeNode posOrder(TreeNode node, int[] record){
        return null;
    }

}
