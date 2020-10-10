package writtenexamination.极致游戏;

/*
-2 1 -3 4 -2 3 2 -5 4
 */

import java.util.Scanner;

public class BigestSubsetCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        if(len == 0){
            System.out.println(0);
            return;
        }
        int[] arr = new int[len];
        int maxSum = 0;
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < len; i++) {
            if (arr[i]<0){
                continue;
            }
            int tmp = arr[i];
            for (int j = i; j < len-1; j++) {
                if(arr[j+1] <0 && Math.abs(arr[j+1]) >arr[j]){
                    break;
                }
                tmp += arr[j+1];
            }
            maxSum = Math.max(maxSum,tmp);
        }
        System.out.println(maxSum);
    }
}
