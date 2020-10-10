package 剑指offer.arr;

public class FindReapetNum {
    public int findRepeatNumber(int[] nums) {
        int[] dp = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            index = nums[i];
            if(dp[index] == 0){
                dp[index]++;
            }else {
                break;
            }
        }
        return index;
    }
}
