package leetcode.arraylist;

/*
216. 组合总和 III
找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。

说明：

所有数字都是正整数。
解集不能包含重复的组合。
示例 1:

输入: k = 3, n = 7
输出: [[1,2,4]]
示例 2:

输入: k = 3, n = 9
输出: [[1,2,6], [1,3,5], [2,3,4]]
 */


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ArrayCountⅢ {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        Deque<Integer> combine = new ArrayDeque<>();
        dfs(n,k,1,0,ans,combine);
        return ans;
    }

    public void dfs(int n, int k, int start, int len, List<List<Integer>> ans, Deque<Integer> combine){
        if(n == 0 && len ==k){
            ans.add(new ArrayList<>(combine));
            return;
        }

        if(len == k){
            return;
        }

        for (int i = start; i <= 9 ; i++) {
            if(n-i >0) {
                combine.addLast(i);
                dfs(n - i, k, i + 1, len + 1, ans, combine);
                combine.removeLast();
            }
        }
    }
}
