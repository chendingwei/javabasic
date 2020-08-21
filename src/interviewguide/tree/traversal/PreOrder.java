package interviewguide.tree.traversal;

import java.util.LinkedList;

public class PreOrder {
    public void preOrder(TreeNode root){
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.push(root);

        while (!stack.isEmpty()){
            TreeNode cur = stack.pop();
            System.out.print(cur.val+"-");
            if(cur.right!=null) {
                stack.push(cur.right);
            }
            if(cur.left!=null) {
                stack.push(cur.left);
            }
        }
        System.out.println();
    }
}
