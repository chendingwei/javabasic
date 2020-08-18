package basicalgorithm.traversal;

import java.util.LinkedList;
import java.util.List;

public class LastTraversal {
    public List<Integer> lastTraversal(TreeNode root){
        List<Integer> list = new LinkedList<>();
        lastTraversal(root,list);
        return list;
    }

    public void lastTraversal(TreeNode node, List<Integer> list){
        if(node == null){
            return;
        }
        if(node.left != null) {
            lastTraversal(node.left,list);
        }
        if(node.right != null){
            lastTraversal(node.right,list);
        }
        list.add(node.val);
    }
}
