package leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermute {
    public List<String> ans = new ArrayList<>();
    public StringBuilder sb = new StringBuilder();
    public String str;
    public List<String> letterCasePermutation(String S) {
        str = S;
        if(S.length() == 0){
            return ans;
        }
        dfs(0);
        return ans;
    }
    public void dfs(int begin){
        if(begin == str.length()){
            ans.add(sb.toString());
            return;
        }
        char c = str.charAt(begin);
        if(c >= '0' && c<= '9'){
            sb.append(c);
            dfs(begin+1);
            sb.deleteCharAt(sb.length()-1);
        }else {
            for (int i = 0; i < 2; i++) {
                if(i == 0){
                    sb.append(Character.toLowerCase(c));
                    dfs(begin+1);
                    sb.deleteCharAt(sb.length()-1);
                }else {
                    sb.append(Character.toUpperCase(c));
                    dfs(begin+1);
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        }
    }
}
