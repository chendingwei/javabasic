package 剑指offer.stack;

import java.util.Stack;

public class CQueue {
    public Stack<Integer> stackIn;
    public Stack<Integer> stackOut;

    public CQueue(){
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    public void appendTail(int value) {
        stackIn.push(value);
    }

    public int deleteHead() {
        if(!stackOut.isEmpty()){
            return stackOut.pop();
        }
        if (stackIn.isEmpty()){
            return -1;
        }
        while (!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());
        }
        return stackOut.pop();
    }
}
