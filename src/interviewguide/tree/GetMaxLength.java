package interviewguide.tree;

import java.util.HashMap;

public class GetMaxLength {
    public static int getMaxLength(TreeNode root, int sum){
        HashMap<Integer,Integer> sumMap = new HashMap<Integer, Integer>();
        sumMap.put(0,0);
        int res = preOrder(root,sum,0,1,0,sumMap);
        return res;
    }

    public static int preOrder(TreeNode root, int sum,int preSum, int level, int maxlen,HashMap<Integer,Integer> sumMap){
        if(root == null){
            return maxlen;
        }
        int curSum = preSum + root.val;
        if(!sumMap.containsKey(curSum)){
            sumMap.put(curSum,level);
        }
        if(sumMap.containsKey(curSum - sum)){
            maxlen = Math.max(maxlen,level - sumMap.get(curSum-sum));
        }
        maxlen = preOrder(root.left,sum,curSum,level+1,maxlen,sumMap);
        maxlen = preOrder(root.right,sum,curSum,level+1,maxlen,sumMap);
        if(level == sumMap.get(curSum)){
            sumMap.remove(curSum);
        }
        return maxlen;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(-3);
        root.left = new TreeNode(3);
        root.right = new TreeNode(-9);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(0);
        root.left.right.left = new TreeNode(1);
        root.left.right.right = new TreeNode(6);

        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(1);

        int res = getMaxLength(root, 6);
        System.out.println(res);
    }
}
