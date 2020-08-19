package leetcode.array;

/*
41. 缺失的第一个正数

给你一个未排序的整数数组，请你找出其中没有出现的最小的正整数。

示例 1:

输入: [1,2,0]
输出: 3
示例 2:

输入: [3,4,-1,1]
输出: 2
示例 3:

输入: [7,8,9,11,12]
输出: 1
 */


import java.util.Arrays;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int miss = 1;

        for(int i=0;i<nums.length;i++){
            if(nums[i] < miss){
                continue;
            }else if(nums[i] == miss){
                miss++;
            }else {
                return miss;
            }
        }
        return miss;
    }
}
