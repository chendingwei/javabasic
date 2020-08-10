package com.datastructure.sort;

public class Selection {
    public static void sort(Comparable[] a){
        for (int i=0;i<a.length-1;i++){
            int index = i;
            for (int j=i+1;j<a.length;j++){
                if(greater(a[index],a[j])){
                    index = j;
                }
            }
            exch(a,i,index);
        }

    }


    private static boolean greater(Comparable v,Comparable w){
        int res = v.compareTo(w);
        return res>0;
    }
    private static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
