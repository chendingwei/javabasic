package writtenexamination.同城58;

import java.util.*;

public class LayerTraveral {
    public ArrayList<ArrayList<Integer>> printNode (TreeNode node) {
        // write code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(node);
        while (!queue.isEmpty()){
            ArrayList<Integer> layers = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.removeFirst();
                if(cur.left != null){
                    queue.addLast(cur.left);
                }
                if(cur.right != null){
                    queue.addLast(cur.right);
                }
                layers.add(cur.val);
            }
            ans.add(layers);
        }
        return ans;
    }
}
class TreeNode {
   int val = 0;
   TreeNode left = null;
   TreeNode right = null;

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}