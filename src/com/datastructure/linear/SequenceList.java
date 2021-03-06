package com.datastructure.linear;

import java.util.Iterator;

public class SequenceList<T> implements Iterable{
    //    存储元素的数组
    private T[] eles;
    //    当前线性表的长度
    private int N;

    // 构造方法
    public SequenceList(int capacity){
        this.eles = (T[])new Object[capacity];
        this.N = 0;
    }

    public void clear(){
        this.N=0;
    }

    public boolean isEmpty(){
        return N==0;
    }

    public int length(){
        return N;
    }

    public T get(int i){
        return eles[i];
    }

    public void insert(T t){
        if (N ==eles.length){
            resize(2*eles.length);
        }
        eles[N++] = t;
    }

    public void insert(int i,T t){
        if (N ==eles.length){
            resize(2*eles.length);
        }

        for(int index=N;index>i;index--){
            eles[index] = eles[index-1];
        }
        eles[i] = t;
        N++;
    }

    public T remove(int i){
        T current = eles[i];
        for(int index=i;index<N-1;index++){
            eles[index] = eles[index+1];
        }
        N--;
        if (N <=eles.length/4){
            resize(eles.length/2);
        }
        return current;
    }

    public void resize(int newSize){
        T[] temp = eles;
        eles = (T[])new Object[newSize];
        for(int i=0;i<N;i++){
            eles[i] = temp[i];
        }
    }

    public int indexOf(T t){
        for(int i=0;i<N;i++){
            if(eles[i].equals(t)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public Iterator iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator{
        private int cusor;

        public SIterator() {
            this.cusor = 0;
        }

        @Override
        public boolean hasNext() {
            return cusor<N;
        }

        @Override
        public Object next() {
            return eles[cusor++];
        }
    }
}
