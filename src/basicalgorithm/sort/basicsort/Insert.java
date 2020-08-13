package basicalgorithm.sort.basicsort;

import java.util.Arrays;

//1、先假定数组的第一个数就是最小数
//2、之后，逐渐增加数组长度，将新增的数与原数组做比较
//3、若大于原数组的最后一个数，说明大于原数组中的所有数，则不变
//4、若小于，则一直交换位置，直到找到小于新数的位置
public class Insert {
    public static void sort(int[] arr){
        for(int i =1;i<arr.length;i++){
            for (int j = i;j>0;j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
