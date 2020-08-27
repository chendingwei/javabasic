package interviewguide.tree;

public class BiggestSubBST {
    public static TreeNode biggestSubBst(TreeNode root){
        int[] record = new int[3];
        TreeNode head = posOrder(root, record);
        return head;
    }

    public static TreeNode posOrder(TreeNode node, int[] record){
        if(node == null){
            record[0] = 0;
            record[1] = Integer.MAX_VALUE;
            record[2] = Integer.MIN_VALUE;
            return null;
        }
        int value = node.val;
        TreeNode left = node.left;
        TreeNode right = node.right;
        TreeNode lBST = posOrder(left,record);
        int lSize = record[0];
        int lMin = record[1];
        int lMax = record[2];
        TreeNode rBST = posOrder(right,record);
        int rSize = record[0];
        int rMin = record[1];
        int rMax = record[2];
        record[1] = Math.min(lMin,value);
        record[2] = Math.max(rMax,value);
        if(left == lBST && right == rBST && lMax < value && value < rMin){

        }
        return null;
    }

}
