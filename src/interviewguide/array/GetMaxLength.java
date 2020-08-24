package interviewguide.array;

import java.util.HashMap;

public class GetMaxLength {
    public static int getMaxLength(int[] arr,int k){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,-1);
        int len = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum+ arr[i];
            if(map.containsKey(sum-k)){
                len = Math.max(i-map.get(sum-k),len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3};
        int k = 6;
        int res = getMaxLength(arr, k);
        System.out.println(res);
    }
}
