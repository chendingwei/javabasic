package interviewguide.list;

import java.util.Stack;

public class StringPalindrome {
    public boolean isPalindrome(String str){
        Stack<String> stack = new Stack<>();
        int half = (str.length()+1)/2;
        String mid;
        for (int i = half; i <str.length() ; i++) {
            mid = str.charAt(i)+"";
            stack.push(mid);

        }
        int index = 0;
        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            if(!(str.charAt(index)+"").equals(stack.pop()) ){
                return false;
            }
            index++;
        }
        return true;
    }
}
