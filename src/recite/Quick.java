package recite;

import java.util.Arrays;

public class Quick {
    public static void sort(int[] arr){
        int left =0;
        int right = arr.length-1;
        sort(arr,left,right);
    }

    public static void sort(int[] arr, int left, int right){
        if(right <= left){
            return;
        }
        int partition = partition(arr, left, right);
        sort(arr,left,partition-1);
        sort(arr,partition+1,right);
    }

    public static int partition(int[] arr,int left, int right){
        int key = arr[left];
        int p1 = left;
        int p2 = right+1;
        while (true){
            while (key < arr[--p2]){
                if(p2 == left){
                    break;
                }
            }
            while (arr[++p1] < key){
                if(p1 == right){
                    break;
                }
            }
            if(left >= right){
                break;
            }else {
                int temp = arr[p1];
                arr[p1] = arr[p2];
                arr[p2] = temp;
            }
        }
        int temp = arr[left];
        arr[left] = arr[p2];
        arr[p2] = temp;
        return p2;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
