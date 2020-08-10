package com.recite.sort;

public class Merge {
    public void sort(int[] arr){
        int head =0;
        int last = arr.length-1;
    }
    public void sort(int[] arr,int lo,int hi){
        if(hi<=lo){
            return ;
        }
        int mid = (lo+hi)/2;
        sort(arr,lo,mid);
        sort(arr,mid+1,hi);
//        merge(arr,lo,mid,hi);
    }
//    public void merge(int[] arr,int lo,int mid,int hi){
//        int i=lo;
//        int p1 =lo;
//        int p2 = mid+1;
//        while (p1<=mid && p2<=hi){
//            if(less(a[p1],a[p2])){
//                assist[i++] = a[p1++];
//            }else{
//                assist[i++] = a[p2++];
//            }
//        }
//
//        while(p1<=mid){
//            assist[i++] = a[p1++];
//        }
//        while(p2<=hi){
//            assist[i++] = a[p2++];
//        }
//
//        for(int index=lo;index<=hi;index++){
//            a[index] = assist[index];
//        }
//    }
}
