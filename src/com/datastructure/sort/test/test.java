package com.datastructure.sort.test;

import com.datastructure.sort.*;

import java.util.Arrays;


public class test {
    public static void TestBubble(Comparable[] a){
        long start = System.currentTimeMillis();
        Bubble.sort(a);
        System.out.println(Arrays.toString(a));
        long end = System.currentTimeMillis();
        System.out.println("Bubble sort cost "+(end - start)+"ms");
    }

    public static void TestInsert(Comparable[] a){
        long start = System.currentTimeMillis();
        Insertion.sort(a);
        System.out.println(Arrays.toString(a));
        long end = System.currentTimeMillis();
        System.out.println("Insert sort cost "+(end - start)+"ms");
    }

    public static void TestSelection(Comparable[] a){
        long start = System.currentTimeMillis();
        Selection.sort(a);
        System.out.println(Arrays.toString(a));
        long end = System.currentTimeMillis();
        System.out.println("Selection sort cost "+(end - start)+"ms");
    }

    public static void TestShell(Comparable[] a){
        long start = System.currentTimeMillis();
        Shell.sort(a);
        System.out.println(Arrays.toString(a));
        long end = System.currentTimeMillis();
        System.out.println("Selection sort cost "+(end - start)+"ms");
    }

    public static void TestMerge(Comparable[] a){
        Merge.sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void TestQuick(Comparable[] a){
        Quick.sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        Integer[] arr = {4,4,8,4,3,6,5,2,1,9,10,11,17,2};
        TestQuick(arr);
    }
}
