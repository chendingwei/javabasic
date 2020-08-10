package com.jvm.gc;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;


// -Xms20m -XX:+PrintGCDetails -verbose:gc
public class Reference {
    private static final int _4MB = 4 * 1024 * 1024;

    public static void main(String[] args) {
        List<SoftReference<byte[]>> list = new ArrayList<>();

        ReferenceQueue<byte[]> queue = new ReferenceQueue<>();

        for(int i=0;i<5;i++){
            //关联软引用队列和对象
            //当软引用所关联的byte数组被回收时，软引用自己会加入queue中
            SoftReference<byte[]> ref = new SoftReference<>(new byte[_4MB],queue);
            System.out.println(ref.get());
            list.add(ref);
            System.out.println(list.size());
        }
        //从队列中获取无用的软引用对象，并移除
        java.lang.ref.Reference<? extends byte[]> poll = queue.poll();

        while(poll!=null){
            list.remove(poll);
            poll = queue.poll();
        }
        System.out.println("`````````````");
        for(SoftReference<byte[]> reference :list){
            System.out.println(reference.get());
        }
    }
}
