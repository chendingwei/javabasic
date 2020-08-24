package interviewguide.tree.traversal;

import interviewguide.tree.TreeNode;

import java.util.LinkedList;

public class InOrder {
    public void inOrder(TreeNode root){
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode cur = root;

        while (!stack.isEmpty() || cur != null){
            if(cur != null){
                stack.push(cur);
                cur = cur.left;
            }else {
                cur = stack.pop();
                System.out.print(cur.val+"-");
                cur = cur.right;
            }
        }
        System.out.println();
    }
}
