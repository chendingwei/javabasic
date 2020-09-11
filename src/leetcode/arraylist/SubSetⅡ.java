package leetcode.arraylist;

/*
90. 子集 II
给定一个可能包含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。

说明：解集不能包含重复的子集。

示例:

输入: [1,2,2]
输出:
[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
 */

import java.util.*;

public class SubSetⅡ {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Deque<Integer> combine = new ArrayDeque<>();
        Arrays.sort(nums);
        dfs(nums,0,0,ans,combine);
        return ans;
    }

    public void dfs(int[] nums, int start, int len, List<List<Integer>> ans, Deque<Integer> combine){
        if(len <= nums.length){
            ans.add(new ArrayList<>(combine));
        }

        if(len == nums.length){
            return;
        }

        for (int i = start; i <nums.length ; i++) {
            if(i>start && nums[i-1] == nums[i]) {
                continue;
            }else {
                combine.addLast(nums[i]);

                dfs(nums, i + 1, len + 1, ans, combine);

                combine.removeLast();
            }
        }
    }
}
