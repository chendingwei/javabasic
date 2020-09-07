package com.forkjoin;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoinTest extends RecursiveTask<Long> {
    private Long start;
    private Long end;

    private Long temp =1_0000L;

    public ForkJoinTest(Long start, Long end) {
        this.start = start;
        this.end = end;
    }

    private Long sum = 0L;

    @Override
    protected Long compute() {
        if(end-start<temp){
            for (Long i = start; i <= end ; i++) {
                sum+=i;
            }
            return sum;
        }else {
            Long mid = (end - start)/2;
            ForkJoinTest task1 = new ForkJoinTest(start, mid);
            task1.fork();
            ForkJoinTest task2 = new ForkJoinTest(mid + 1, end);
            task2.fork();
            return task1.join() + task2.join();
        }
    }
}
