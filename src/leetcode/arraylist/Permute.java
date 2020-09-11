package leetcode.arraylist;

/*
46. 全排列
给定一个 没有重复 数字的序列，返回其所有可能的全排列。

示例:

输入: [1,2,3]
输出:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
 */

import java.util.ArrayList;
import java.util.List;

public class Permute {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combine = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        dfs(nums,used,0,nums.length,ans,combine);
        return ans;
    }

    public void dfs(int[] nums, boolean[] used, int depth ,int len, List<List<Integer>> ans, List<Integer> combine){
        if(depth == len){
            ans.add(new ArrayList<>(combine));
            return;
        }
        for(int i=0;i<len;i++){
            if(!used[i]) {
                combine.add(nums[i]);
                used[i] = true;

                dfs(nums,used,depth+1,len,ans,combine);

                used[i] = false;
                combine.remove(combine.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        Permute permute = new Permute();
        int[] nums = {1,2,3};
        List<List<Integer>> permute1 = permute.permute(nums);
        System.out.println();
    }
}
