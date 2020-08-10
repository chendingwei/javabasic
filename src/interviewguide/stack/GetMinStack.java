package interviewguide.stack;

import java.util.Stack;

public class GetMinStack {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public GetMinStack(){
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(int newNum){
        stackData.push(newNum);
        if(stackMin.empty()){
            stackMin.push(newNum);
        }else if(this.getMin()>newNum){
            stackMin.push(newNum);
        }
    }

    public int pop(){
        Integer pop = stackData.pop();
        if(pop == getMin()){
            stackData.pop();
        }
        return pop;
    }

    public int getMin(){
        return stackMin.peek();
    }
}
