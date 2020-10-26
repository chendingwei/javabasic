package writtenexamination.test;

import java.util.Scanner;

public class LongestSubStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str + ",";
        boolean flag = true;
        int len = 1;
        StringBuilder sb = new StringBuilder();
        while (flag) {
            String tmp = null;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ',') {
                    if(tmp == null){
                        tmp = str.charAt(i-len)+"";
                    }else {
                        if(tmp.equals(str.charAt(i-len)+"")){
                            break;
                        }else {
                            tmp = null;
                            flag = false;
                            break;
                        }
                    }
                }
            }
            if(flag) {
                len++;
                sb.insert(0, tmp);
            }
        }
        String res = sb.toString();
        if(res.length() == 0){
            System.out.print("NULL");
        }else {
            System.out.print(res);
        }
    }
}
