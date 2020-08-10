package interviewguide.stack;

import java.util.Stack;

public class TwoStackQueue {
    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;

    public TwoStackQueue(){
        this.stackPush = new Stack<Integer>();
        this.stackPop = new Stack<Integer>();
    }

    public void add(int newNum){
        stackPush.push(newNum);
    }

    public int poll(){
        if(stackPop.empty()) {
            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    public int peek(){
        if(stackPop.empty())
        while (!stackPush.empty()){
            stackPop.push(stackPush.pop());
        }
        return stackPop.peek();
    }
}
