package writtenexamination.threesixzero;

import java.util.Scanner;

public class IllegelName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res =0;
        int length = Integer.parseInt(sc.nextLine());
        for(int i=0;i<length;i++){
            String name = sc.nextLine();
            if(name.length()<=10){
                if(contain(name)){
                   res++;
                }
            }
        }
        System.out.println(res);
    }

    public static boolean contain(String str) {
        for (int j = 0; j < str.length(); j++) {
            char temp = str.charAt(j);
            if ((temp >= 'a' && temp <= 'z') || (temp >= 'A' && temp <= 'Z') || (temp >= '0' && temp <= '9')) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
