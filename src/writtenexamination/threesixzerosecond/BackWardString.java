package writtenexamination.threesixzerosecond;

import java.util.LinkedList;
import java.util.Scanner;

public class BackWardString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            String input = sc.nextLine();
            if(input.length() == 0){
                return;
            }
            judgement(input);
        }
    }

    public static void judgement(String str){
        String rule = "AHIMOTUVWXY";
        LinkedList<String> stack = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            String temp = str.charAt(i) + "";
            if (rule.contains(temp)) {
                stack.push(temp);
                continue;
            } else {
                System.out.println("NO");
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        String res= sb.toString();
        if(res.equals(str)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
