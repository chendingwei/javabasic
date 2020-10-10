package leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NumberCombine {
    public static final HashMap<String,String> map = new HashMap<>(){
        {
            put("2","abc");
            put("3","def");
            put("4","ghi");
            put("5","jkl");
            put("6","mno");
            put("7","pqrs");
            put("8","tuv");
            put("9","wxyz");
        }
    };

    public List<String> ans = new ArrayList<>();
    public StringBuilder sb = new StringBuilder();
    public String digits;
    public List<String> letterCombinations(String digits) {
        this.digits = digits;
        dfs(0);
        return ans;
    }

    public void dfs(int start){
        if(start == digits.length()){
            ans.add(sb.toString());
            return;
        }
        String s = map.get(digits.charAt(start) + "");
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            dfs(start+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
