package leetcode.string;

/*
647. 回文子串

给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。

具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。

示例 1：

输入："abc"
输出：3
解释：三个回文子串: "a", "b", "c"
示例 2：

输入："aaa"
输出：6
解释：6个回文子串: "a", "a", "a", "aa", "aa", "aaa"
 */

import java.util.Arrays;

public class CountSubstrings {
    public int countSubstrings(String s) {
        int len = s.length();
        int res = 0;
        boolean[][] dp = new boolean[len][len];

        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                if(isSubString(s.substring(i,j+1))){
                    dp[i][j] = true;
                }
            }
        }

        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(dp[i][j]){
                    res++;
                }
            }
        }
        return res;
    }

    public boolean isSubString(String s){
        int i=0;
        int j = s.length()-1;

        while ( i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
                continue;
            }else {
                return false;
            }
        }
        return true;
    }

}
