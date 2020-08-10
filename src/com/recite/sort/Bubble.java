package com.recite.sort;

public class Bubble {
    public void sort(int[] a){
        int len = a.length;
        for(int i =len-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,5,7,6,4,1,2};
        Bubble bubble = new Bubble();
        bubble.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
