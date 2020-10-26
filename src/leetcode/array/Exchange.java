package leetcode.array;

public class Exchange {
    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left < right){
            if (nums[left] %2 != 0){
                left++;
                continue;
            }

            if (nums[right] %2 == 0){
                right--;
                continue;
            }

            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
        }
        return nums;
    }
}
