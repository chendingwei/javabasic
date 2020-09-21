package writtenexamination.好未来;

import java.util.Stack;

public class EarlyTraversal {
    public String notReCuPreOrder (TreeNode root) {
        // write code here
        Stack<TreeNode> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            sb.append(cur.val+",");
            if (cur.right != null) {
                stack.push(cur.right);
            }
            if (cur.left != null){
                stack.push(cur.left);
            }
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
}