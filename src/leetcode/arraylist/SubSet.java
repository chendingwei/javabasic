package leetcode.arraylist;

/*
78. 子集
给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。

说明：解集不能包含重复的子集。

示例:

输入: nums = [1,2,3]
输出:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SubSet {
    public List<List<Integer>> subSet(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Deque<Integer> combine = new ArrayDeque<>();
        dfs(nums,0,nums.length,ans,combine);
        return ans;
    }

    public void dfs(int[] num, int begin, int len, List<List<Integer>> ans, Deque<Integer> combine) {
        if(begin < len ){
            ans.add(new ArrayList<>(combine));
        }

        if(begin == len){
            return;
        }

        for (int i = begin; i < num.length; i++) {
            combine.addLast(num[i]);

            dfs(num,i+1,len,ans,combine);

            combine.removeLast();

        }
    }
}
