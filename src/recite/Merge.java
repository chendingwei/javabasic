package recite;

import java.util.Arrays;

public class Merge {
    private static int[] assist;

    public static void sort(int[] arr){
        assist = new int[arr.length];
        int left = 0;
        int right = arr.length-1;
        sort(arr,left,right);
    }

    public static void sort(int[] arr, int left,int right){
        if(left>=right){
            return;
        }

        int mid = (left + right)/2;
        sort(arr,left,mid);
        sort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }

    public static void merge(int[] arr, int left, int mid, int right){
        int i = left;
        int p1 = left;
        int p2 = mid+1;

        while (p1 <= mid && p2 <= right){
            if(arr[p1] < arr[p2]){
                assist[i] = arr[p1];
                i++;
                p1++;
            }else {
                assist[i] = arr[p2];
                i++;
                p2++;
            }
        }

        while (p1 <= mid){
            assist[i++] = arr[p1++];
        }
        while (p2 <=right){
            assist[i++] = arr[p2++];
        }

        for(int j=0;j<=right;j++){
            arr[j] = assist[j];
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
