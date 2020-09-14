package writtenexamination.同城58;

import java.util.Arrays;

public class FindMinNum {
    public int firstMissingPositive (int[] nums) {
        // write code here
        Arrays.sort(nums);
        int min = 1;
        for (int num : nums) {
            if (num == min){
                min++;
            }else if(num > min){
                break;
            }
        }
        return min;
    }
}
