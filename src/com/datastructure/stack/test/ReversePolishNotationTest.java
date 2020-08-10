package com.datastructure.stack.test;

import com.datastructure.stack.Stack;

public class ReversePolishNotationTest {

    public static void main(String[] args) {
        //3*(17-15)+18/6
        String[] notation = {"3","17","15","-","*","18","6","/","+"};
        int res = caculator(notation);
        System.out.println(res);
    }
    public static int caculator(String[] notation){
        Stack<Integer> opperate = new Stack<>();
        for (int i = 0; i < notation.length; i++) {
            String cur = notation[i];
            Integer o1;
            Integer o2;
            Integer res;
            switch (cur){
                case "+":
                    o1 = opperate.pop();
                    o2 = opperate.pop();
                    res = o2+o1;
                    opperate.push(res);
                    break;
                case "-":
                    o1 = opperate.pop();
                    o2 = opperate.pop();
                    res = o2-o1;
                    opperate.push(res);
                    break;
                case "*":
                    o1 = opperate.pop();
                    o2 = opperate.pop();
                    res = o2* o1;
                    opperate.push(res);
                    break;
                case "/":
                    o1 = opperate.pop();
                    o2 = opperate.pop();
                    res = o2/o1;
                    opperate.push(res);
                    break;
                default:
                    opperate.push(Integer.parseInt(cur));
            }
        }

        int result = opperate.pop();
        return result;
    }
}
