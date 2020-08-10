package com.datastructure.sort;

public class Sort {
    public static void sort(Comparable[] a){

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
