package basicalgorithm.sort.advancedsort;

import java.util.Arrays;

//1、首先设定一个分界值，通过该分界值将数组分成左右两部分
//2、将大于或等于分界值的数据放到到数组右边，小于分界值的数据放到数组的左边
//3、对于左侧的数组数据，又可以取一个分界值，将数据分成两部分，右边同理
//4、重复上述过程
public class Quick {
    public static void sort(int[] arr){
        int s = 0;
        int e = arr.length-1;
        sort(arr,s,e);
    }

    public static void sort(int[] arr, int s, int e){
        if(e <= s){
            return;
        }

        int partition = partition(arr, s, e);
        sort(arr,s,partition-1);
        sort(arr,partition+1,e);
    }

    public static int partition(int[] arr, int s, int e){
        int key = arr[s];
        int left = s;
        int right = e+1;
        while (true){
            while (key < arr[--right]){
                if(right == s){
                    break;
                }
            }
            while (arr[++left] < key){
                if(left == e){
                    break;
                }
            }

            if(left >= right){
                break;
            }else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        int temp = arr[s];
        arr[s] = arr[right];
        arr[right] = temp;
        return right;
    }

    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
