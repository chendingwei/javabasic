package com.datastructure.stack.localvar;

import java.util.Stack;

public class BracketMatch {

    public static void main(String[] args) {
        String str = "(上海(长安)())";
        boolean res = isMatch(str);
        System.out.println(res);
    }

    public static boolean isMatch(String str){
        Stack<String> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            String cur = str.charAt(i)+"";
            if(cur.equals("(")){
                stack.push(cur);
            }else if(cur.equals(")")){
                if(stack.pop()==null){
                    return false;
                }
            }
        }
        if(stack.empty()){
            return true;
        }else {
            return false;
        }

    }
}
