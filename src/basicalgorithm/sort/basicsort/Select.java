package basicalgorithm.sort.basicsort;

import java.util.Arrays;

//1、设置最小值所在的索引，默认为数组第一个数
//2、遍历整个数组，寻找最小的数，记录其索引，与遍历前的索引，互换索引位置上的数
//3、每次遍历，都能找到当前最小的数字，并固定在数组的第一个位置上

public class Select {
    public static void sort(int[] arr){
        int min_index;
        for (int i = 0; i <arr.length ; i++) {
            min_index = i;
            for (int j = i; j <arr.length ; j++) {
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
