package basicalgorithm.sort.basicsort;

import java.util.Arrays;


//1、从数组顶部开始，向后遍历，若前数大于后数，则交互位置，将大数置于最后
//2、每固定一个数，则将需要遍历的数组长度减少1，只遍历已固定数之前的数组，并寻找次大数
//3、以此类推，直到只剩最后一个数
public class Bubble {
    public static void sort(int[] arr){
        int len = arr.length;
        for (int i = len-1 ; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] ints = {5,4,3,2,1};
        sort(ints);
        System.out.println(Arrays.toString(ints));

    }

}
