package com.recite.sort;

public class Shell {
    public void sort(int[] arr){
        int h =1;
        int len = arr.length;
        while(h<len/2){
            h = 2*h+1;
        }
        while(h>=1){
            for(int i=h;i<len;i++){
                for(int j=i;j>=h;j-=h){
                    if(arr[j]<arr[j-h]){
                        int temp = arr[j];
                        arr[j] = arr[j-h];
                        arr[j-h] = temp;
                    }else {
                        break;
                    }
                }
            }
            h=h/2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,5,7,6,4,1,2};
        Shell shell = new Shell();
        shell.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

