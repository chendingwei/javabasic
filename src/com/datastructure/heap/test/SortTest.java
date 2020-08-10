package com.datastructure.heap.test;

import com.datastructure.heap.HeapSort;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        //待排序数据
        String[] arr = {"S","O","R","T","E","X","A","M","P","L","E"};
        //通过heapsort进行排序
        HeapSort.sort(arr);
        //打印排序后的元素
        System.out.println(Arrays.toString(arr));
    }
}
