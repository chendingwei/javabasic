package 剑指offer.tree;

import java.util.HashMap;

public class PreInRebuild {
    public int[] preorder;
    public int[] inorder;
    public HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        TreeNode head = rebuild(0,preorder.length-1,0,inorder.length-1);
        return head;
    }

    public TreeNode rebuild(int ps, int pe, int is, int ie){
        if(ps>pe){
            return null;
        }
        TreeNode cur = new TreeNode(preorder[ps]);
        int index = map.get(preorder[ps]);
        cur.left = rebuild(ps+1,ps+index-is,is,index-1);
        cur.right = rebuild(ps+index-is+1,pe,index+1,ie);
        return cur;
    }
}
