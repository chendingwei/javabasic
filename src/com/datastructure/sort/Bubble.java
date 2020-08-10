package com.datastructure.sort;
//O(N^2)
public class Bubble {
    public static void sort(Comparable[] a){
        for(int i=a.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(greater(a[j],a[j+1])){
                    exch(a,j,j+1);
                }
            }
        }
    }

    public static boolean greater(Comparable v, Comparable m){
        int res = v.compareTo(m);
        return res>0;
    }

    public static void exch(Comparable[] a, int i, int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
