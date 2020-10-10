package 剑指offer.arr;

public class MinArray {
    public int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length-1;
        while (left < right){
            int m = (left+right) /2;
            if(numbers[m] <numbers[right]) {
                right = m;
            }else if(numbers[m] > numbers[right]){
                left = m+1;
            }else {
                right--;
            }
        }
        return numbers[left];
    }
}
