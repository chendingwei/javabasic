package leetcode.arraylist;

/*
77. 组合
给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。

示例:

输入: n = 4, k = 2
输出:
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Combine {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        Deque<Integer> combine = new ArrayDeque<>();
        dfs(n,k,1,0,ans,combine);
        return ans;
    }

    public void dfs(int n, int k, int start, int len, List<List<Integer>> ans, Deque<Integer> combine){
        if(len == k){
            ans.add(new ArrayList<>(combine));
            return;
        }


        for(int i = start;i<=n;i++){
            combine.addLast(i);

            dfs(n,k,i+1,len+1,ans,combine);

            combine.removeLast();
        }
    }
}
