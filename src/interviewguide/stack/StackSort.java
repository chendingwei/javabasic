package interviewguide.stack;

import java.util.Stack;

public class StackSort {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        stack = sort(stack);

        for (Integer s : stack) {
            System.out.println(s);
        }
    }

    public static Stack<Integer> sort(Stack<Integer> stack){
        Stack<Integer> help = new Stack<Integer>();
        while (!stack.empty()){
            int cur = stack.pop();
            while (!help.empty() && help.peek()>cur){
                stack.push(help.pop());
            }
            help.push(cur);
        }
        return help;
    }

}
