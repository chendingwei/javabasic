package com.datastructure.heap;

public class HeapSort<T extends Comparable<T>> {
    public static void sort(Comparable[] source){
        //构建堆
        Comparable[] heap = new Comparable[source.length+1];
        createHeap(source,heap);
        //定义变量，记录未排序的最大索引
        int N = heap.length-1;
        //通过循环，交换1位置的元素和 最大索引处的元素
        while (N != 1) {
            exch(heap, 1, N);
            //排除交互后最大元素所在的索引，不参与堆的下沉调整
            //对索引1的元素进行下沉调整
            sink(heap, 1, --N);
        }
        System.arraycopy(heap,1,source,0,heap.length-1);
    }

    private static void createHeap(Comparable[] source,Comparable[] heap){
        //把sort中的元素，拷贝到heap中，heap中的元素形成一个无序堆
        System.arraycopy(source,0,heap,1,source.length);
        //接下来需要对heap中的元素做下沉调整，从长度的一半处开始，往索引1处扫描
        for(int i = source.length/2; i>0;i--){
            sink(heap,i,heap.length-1);
        }
    }

    private static boolean less(Comparable[] heap,int i,int j){
        return heap[i].compareTo(heap[j]) <0;
    }

    private static void exch(Comparable[] heap,int i,int j){
        Comparable temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private static void sink(Comparable[] heap,int target,int range){
        while (2*target <= range){
            //1、找出当前节点的较大子节点
            int max;
            if(2*target + 1 <= range){
                if(less(heap,2*target,2*target+1)){
                    max = 2*target+1;
                }else {
                    max = 2*target;
                }
            }else {
                max = 2*target;
            }
            //2、比较当前节点的值和较大子节点的值
            if(less(heap,target,max)){
                exch(heap,target,max);
                target = max; //循环下沉
            }else {
                break;
            }
        }
    }
}
