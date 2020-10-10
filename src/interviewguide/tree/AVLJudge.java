package interviewguide.tree;

public class AVLJudge {
    public boolean isAVL(TreeNode root){
        boolean res = true;
        getHeight(root,1,res);
        return res;
    }

    public int getHeight(TreeNode cur, int level, boolean res){
        if(cur == null){
            return level;
        }
        int lH = getHeight(cur.left, level + 1, res);
        if(!res){
            return level;
        }
        int rH = getHeight(cur.right, level + 1, res);
        if(!res){
            return level;
        }
        if(Math.abs(lH-rH)>1){
            res = false;
        }
        return Math.max(lH,rH);
    }

    public static void main(String[] args) {

    }
}
