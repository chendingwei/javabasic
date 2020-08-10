package interviewguide.stack;

import java.util.Stack;

public class ReverseStack {
    private Stack<Integer> stack;

    public ReverseStack() {
        this.stack = new Stack<Integer>();
    }

    public int getLastElement(){
        int res = stack.pop();
        if(stack.empty()){
            return res;
        }else {
            int cur = getLastElement();
            stack.push(res);
            return cur;
        }
    }

    public void reverse(){
        if(stack.empty()){
            return;
        }
        int i = getLastElement();
        reverse();
        stack.push(i);
    }

    public Stack<Integer> getStack(){
        return stack;
    }


}
