package interviewguide.tree;

public class MaxDistance {
    public int record;


    public int posOrder(TreeNode cur, int record){
        if(cur == null){
            record = 0;
            return 0;
        }
        int lMax = posOrder(cur.left,record);
        int maxFromLeft = record;
        int rMax = posOrder(cur.right,record);
        int maxFromRight = record;

        int curNodeMax = maxFromLeft + maxFromRight +1;
        record = Math.max(maxFromLeft, maxFromRight) + 1;
        return Math.max((Math.max(maxFromLeft,maxFromRight)),curNodeMax);
    }

    public int posOrder(TreeNode cur){
        if(cur == null){
            record = 0;
            return record;
        }
        return record;
    }

}
