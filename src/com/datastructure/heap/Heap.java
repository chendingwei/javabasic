package com.datastructure.heap;

public class Heap<T extends Comparable<T>> {
    private T[] items;
    private int N;

    public Heap(int n) {
        this.items =(T[]) new Comparable[n+1];
        this.N = 0;
    }

    private boolean less(int i,int j){
        return items[i].compareTo(items[j])<0;
    }

    private void exch(int i,int j){
        T temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }

    public void insert(T t){
        items[++N] = t;
        swim(N);
    }

    private void swim(int k){
        //通过循环比较当前节点及其父节点的值
        while (k>1){
            if(less(k/2,k)){
                exch(k/2,k);
            }
            k = k/2;
        }
    }

    public T delMax(){
        T max = items[1];
        items[1] = items[N];
        items[N] = null;
        N--;
        sink(1);
        return max;
    }

    private void sink(int k){
        while (2*k<=N){
            int max;
            if(2*k+1<=N){
                if(less(2*k,2*k+1)){
                    max = 2*k+1;
                }else {
                    max = 2*k;
                }
            }else{
                max = 2*k;
            }
            if(!less(k,max)){
                break;
            }
            exch(k,max);
            k=max;
        }
    }
}
