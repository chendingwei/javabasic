package basicalgorithm.sort.advancedsort;

//1、分组后合并的思想
//2、分组的方式是，前中后三个节点，[前，中]一段，[中+1，后]一段
//3、排序是合并阶段进行的，使用等长的辅助数组，在对应的位置进行赋值
//4、排序方式是通过分组比较，将小的值按照顺序放入辅助数组

import java.util.Arrays;

public class Merge {
    private static int[] assist;

    public static void sort(int[] arr){
        assist = new int[arr.length];
        int lo =0;
        int hi = arr.length-1;
        sort(arr,lo,hi);
    }

    public static void sort(int[] arr, int s, int e){
        if(e<=s){
            return;
        }
        int mid = (s+e)/2;
        sort(arr,s,mid);
        sort(arr,mid+1,e);
        merge(arr,s,mid,e);
    }

    public static void merge(int[] arr, int s, int mid, int e){
        int i = s;
        int p1 = s;
        int p2 = mid+1;

        while (p1 <= mid && p2 <= e){
            if(arr[p1] <arr[p2]){
                assist[i] = arr[p1];
                p1++;
                i++;
            }else {
                assist[i] = arr[p2];
                p2++;
                i++;
            }
        }

        while (p1 <= mid){
            assist[i++] = arr[p1++];
        }
        while (p2 <= e){
            assist[i++] = arr[p2++];
        }

        for (int index=0;index<=e;index++){
            arr[index] = assist[index];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
