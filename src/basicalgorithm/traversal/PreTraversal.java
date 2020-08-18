package basicalgorithm.traversal;

import java.util.LinkedList;
import java.util.List;

public class PreTraversal {
    public List<Integer> preTraversal(TreeNode root){
        List<Integer> list = new LinkedList<>();
        preTraversal(root,list);

        return list;
    }

    public void preTraversal(TreeNode node, List<Integer> list){
        if(node == null){
            return;
        }
        list.add(node.val);
        if(node.left != null) {
            preTraversal(node.left, list);
        }
        if(node.right != null) {
            preTraversal(node.right, list);
        }
    }

}
