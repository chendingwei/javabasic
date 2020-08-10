package com.recite.sort;

public class Selection {
    public void sort(int[] arr){
        int len = arr.length;
        int index;
        for(int i=0;i<len-1;i++){
            index = i;
            for(int j=i+1;j<len;j++){
                if(arr[index]>arr[j]){
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

        }
    }

    public static void main(String[] args) {
        int[] arr = {3,5,7,6,4,1,2};
        Selection selection = new Selection();
        selection.sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
