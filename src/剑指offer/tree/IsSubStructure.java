package 剑指offer.tree;

public class IsSubStructure {
    boolean res = false;
    public boolean isSubStructure(TreeNode A, TreeNode B) {



        return res;
    }

    public void dfs(TreeNode nodeA, int val){
        if (nodeA == null){
            return;
        }
        if(nodeA.val == val){

        }

    }

    public void dfs(TreeNode nodeA, TreeNode nodeB){
        if(nodeA.val != nodeB.val){
            return;
        }
    }
}
