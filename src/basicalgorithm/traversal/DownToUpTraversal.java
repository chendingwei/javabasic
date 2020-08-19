package basicalgorithm.traversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DownToUpTraversal {
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        if(root == null){
            return list;
        }
        levelOrderBottom(root,list);
        return list;
    }

    public void levelOrderBottom(TreeNode node, List<List<Integer>> list){
        Stack<List<Integer>> stack = new Stack<List<Integer>>();
        LinkedList<TreeNode> assist = new LinkedList<>();
        assist.add(node);
        while (!assist.isEmpty()){
            List<Integer> helper = new LinkedList<>();
            int size = assist.size();
            for(int i=0;i<size;i++){
                TreeNode cur = assist.pop();
                if(cur.left != null){
                    assist.add(cur.left);
                }
                if(cur.right != null){
                    assist.add(cur.right);
                }
                helper.add(cur.val);
            }
            stack.push(helper);
        }

        while (!stack.empty()){
            list.add(stack.pop());
        }
    }

}
