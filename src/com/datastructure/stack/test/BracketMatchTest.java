package com.datastructure.stack.test;

import com.datastructure.stack.Stack;

public class BracketMatchTest {
    public static void main(String[] args) {
        String str = "(上海(长安)())";
        boolean match = isMatch(str);
        System.out.println(match);
    }

    public static boolean isMatch(String str){
        Stack<String> chars = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            String cur = str.charAt(i) + "";
            if(cur.equals("(")){
                chars.push(cur);
            }
            else if(cur.equals(")")){
                if(chars.pop()==null){
                    return false;
                }
            }
        }
        if(chars.size()==0){
            return  true;
        }else{
            return false;
        }
    }
}
