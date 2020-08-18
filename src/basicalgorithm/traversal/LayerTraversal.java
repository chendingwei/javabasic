package basicalgorithm.traversal;

import java.util.*;

public class LayerTraversal {
    public List<List<Integer>> layerTraversal(TreeNode root){
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        layerTraversal(root,list);
        return list;
    }

    public void layerTraversal(TreeNode node, List<List<Integer>> list){
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        List<Integer> temp = new ArrayList<Integer>();
        queue.add(node);
        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode now = queue.pop();
                if(now.left!=null) {
                    queue.add(now.left);
                }
                if(now.right!=null) {
                    queue.add(now.right);
                }
                temp.add(now.val);
            }
            list.add(temp);
        }
    }
}
