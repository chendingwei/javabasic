package com.datastructure.stack.test;

import com.datastructure.stack.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");

        for(String s:stack){
            System.out.println(s);
        }
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}
