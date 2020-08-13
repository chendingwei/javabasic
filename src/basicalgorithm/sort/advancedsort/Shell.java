package basicalgorithm.sort.advancedsort;


import java.util.Arrays;

//1、选定增长量（增大规则 h= 2*h+1.减小规则 h=h/2）
//2、以增长量为分组依据，对组内数据进行插入排序
//3、减少增长率，重复2操作，直到增长量为1后，结束
public class Shell {
    public static void sort(int[] arr){
        int h =1;
        while (h<arr.length/2){
            h = 2*h+1;
        }
        while (h>=1){
            for (int i = h; i <arr.length ; i++) {
                //arr[i]是待插入元素
                //对arr[i]插入到arr[i-h],arr[i-2h]...
                for (int j = i; j >=h ; j-=h) {
                    if(arr[j]<arr[j-h]){
                        int temp = arr[j];
                        arr[j] = arr[j-h];
                        arr[j-h] = temp;
                    }else {
                        break;
                    }
                }
            }
            h = h/2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
