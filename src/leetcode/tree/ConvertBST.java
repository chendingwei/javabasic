package leetcode.tree;


import java.util.Stack;

public class ConvertBST {
    public Stack<TreeNode> stack = new Stack<>();
    public int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root == null){
            return null;
        }
        dfs(root);
        rebuild(root);
        return root;
    }

    public void dfs(TreeNode cur){
        if(cur.left != null){
            dfs(cur.left);
        }
        stack.push(cur);
        if(cur.right != null){
            dfs(cur.right);
        }
    }

    public void rebuild(TreeNode root){
        while (!stack.isEmpty()){
            TreeNode cur = stack.pop();
            sum += cur.val;
            cur.val = sum;
        }
    }
}



class Another{
    public class ConvertBST {
        public int sum = 0;
        public TreeNode convertBST(TreeNode root) {
            if(root == null){
                return null;
            }
            dfs(root);
            return root;
        }

        public void dfs(TreeNode cur){
            if(cur.right != null){
                dfs(cur.right);
            }
            sum += cur.val;
            cur.val = sum;
            if(cur.left != null){
                dfs(cur.left);
            }
        }
    }

}
