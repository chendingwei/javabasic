package interviewguide.stack.test;

import interviewguide.stack.TwoStackQueue;

public class TwoStackQueueTest {

    public static void main(String[] args) {
        TwoStackQueue queue = new TwoStackQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        int poll1 = queue.poll();
        System.out.println(poll1);
        int poll2 = queue.poll();
        System.out.println(poll2);
        int poll3 = queue.poll();
        System.out.println(poll3);
    }
}
