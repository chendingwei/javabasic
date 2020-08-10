package com.recite.sort;

public class Insertion {
    public void sort(int[] arr){
        int len = arr.length;
        for(int i=1;i<len;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,5,7,6,4,1,2};
        Insertion insertion = new Insertion();
        insertion.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
