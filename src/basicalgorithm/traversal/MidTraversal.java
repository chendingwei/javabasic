package basicalgorithm.traversal;

import java.net.PortUnreachableException;
import java.util.LinkedList;
import java.util.List;

public class MidTraversal {
    public List<Integer> midTraversal(TreeNode root){
        List<Integer> list = new LinkedList<>();
        midTraversal(root,list);
        return list;
    }

    public void midTraversal(TreeNode node,List<Integer> list){
        if(node == null){
            return;
        }
        if(node.left!=null){
            midTraversal(node.left,list);
        }
        list.add(node.val);
        if(node.right!=null){
            midTraversal(node.right,list);
        }
    }
}
