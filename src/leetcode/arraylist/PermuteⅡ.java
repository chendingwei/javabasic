package leetcode.arraylist;
/*
47. 全排列 II
给定一个可包含重复数字的序列，返回所有不重复的全排列。

示例:

输入: [1,1,2]
输出:
[
  [1,1,2],
  [1,2,1],
  [2,1,1]
]
 */

import java.util.*;

public class PermuteⅡ {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        Deque<Integer> combine = new ArrayDeque<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        dfs(nums,used,0,nums.length,ans,combine);
        return ans;
    }

    public void dfs(int[] nums, boolean[] used, int depth, int len, List<List<Integer>> ans, Deque<Integer> combine){
        if(depth == len){
            ans.add(new ArrayList<>(combine));
            return;
        }

        for(int i = 0;i<len;i++){
            if(used[i]){
                continue;
            }

            if( i>0 && nums[i] == nums[i-1] && !used[i-1]){
                continue;
            }

            combine.addLast(nums[i]);
            used[i] = true;

            dfs(nums,used,depth+1,len,ans,combine);

            used[i] = false;
            combine.removeLast();
        }
    }
}
