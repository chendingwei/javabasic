package leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> ans = new ArrayList<>();
    public StringBuilder sb = new StringBuilder();
    public int couple = 0;
    public List<String> generateParenthesis(int n) {
        couple = n;
        int left = n;
        int right = n;
        dfs(left,right);
        return ans;
    }

    public void dfs(int left, int right){
        if(left == 0 && right == 0){
            ans.add(sb.toString());
        }
        if(left > right){
            return;
        }
        if(left >0){
            sb.append("(");
            dfs(left-1,right);
            sb.deleteCharAt(sb.length()-1);
        }
        if (right > 0){
            sb.append(")");
            dfs(left,right-1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
