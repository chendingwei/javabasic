package interviewguide.tree;

import java.util.*;

public class RebuildTree {
    public HashMap<Integer,Integer> inMap;

    public int[] pre;
    public int[] in;
    public int[] pos;

    public RebuildTree(int[] pre, int[] in, int[] pos) {
        this.pre = pre;
        this.in = in;
        this.pos = pos;
    }

    public TreeNode preInOrder(){
        inMap = new HashMap<>();
        for (int i = 0; i < in.length; i++) {
            inMap.put(in[i],i);
        }
        TreeNode root = preIn(0,pre.length-1,0,in.length-1);
        return root;
    }

    public TreeNode preIn(int ps, int pe, int is, int ie){
        if(ps > pe){
            return null;
        }
        TreeNode head = new TreeNode(pre[ps]);
        Integer index = inMap.get(pre[ps]);
        head.left = preIn(ps+1,ps+index-is,is,index-1);
        head.right = preIn(ps+index-is+1,pe,index+1,ie);
        return head;
    }


    public TreeNode inPosOrder(){
        inMap = new HashMap<>();
        for (int i = 0; i < in.length; i++) {
            inMap.put(in[i],i);
        }
        TreeNode root = inPos(0,in.length-1,0,pos.length-1);
        return root;
    }

    public TreeNode inPos(int is, int ie, int ps, int pe){
        if(ps > pe){
            return null;
        }
        TreeNode node = new TreeNode(pos[pe]);
        Integer index = inMap.get(pos[pe]);
        node.left = inPos(is,index-1,ps,ps+index-is-1);
        node.right = inPos(index+1,ie,ps+index-is,pe-1);
        return node;

    }



    public List<List<Integer>> layerOrder(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.addLast(root);
        while (!deque.isEmpty()){
            List<Integer> layer = new ArrayList<>();
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = deque.removeFirst();
                layer.add(cur.val);
                if(cur.left != null){
                    deque.addLast(cur.left);
                }
                if (cur.right != null){
                    deque.addLast(cur.right);
                }
            }
            ans.add(layer);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] pre = {1,2,4,5,8,9,3,6,7};
        int[] in = {4,2,8,5,9,1,6,3,7};
        int[] pos = {4,8,9,5,2,6,7,3,1};

        RebuildTree rebuild = new RebuildTree(pre,in,pos);
        TreeNode root = rebuild.preInOrder();
        List<List<Integer>> lists = rebuild.layerOrder(root);
        for (List<Integer> list : lists) {
            System.out.println(list.toString());
        }


    }
}
