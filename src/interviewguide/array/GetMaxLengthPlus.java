package interviewguide.array;

public class GetMaxLengthPlus {
    public static int getMaxLength(int[] arr,int k){
        int left = 0;
        int right = 0;
        int sum = arr[0];
        int len = 0;
        while (right < arr.length){
            if(sum == k){
                len = Math.max(len, right - left+1);
                sum -= arr[left];
                left++;
            }else if(sum < k){
                right++;
                if(right == arr.length){
                    break;
                }
                sum += arr[right];
            }else {
                sum -= arr[left];
                left++;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,1,1};
        int k = 3;
        int res = getMaxLength(arr, k);
        System.out.println(res);
    }
}
