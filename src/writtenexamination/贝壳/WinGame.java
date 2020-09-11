package writtenexamination.贝壳;

import java.util.HashMap;
import java.util.Scanner;

public class WinGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int round = Integer.parseInt(sc.nextLine());
        for(int i=0;i<round;i++){
            String str = sc.nextLine();
            String[] s = str.split(" ");
            String[] niuMei = {s[0],s[1]};
            String[] niuNiu = {s[2],s[3]};
            int left = judge(niuMei[0],niuNiu);
            int right = judge(niuMei[1],niuNiu);
            if(left > right){
                System.out.println("left");
            }else if(left < right){
                System.out.println("right");
            }else {
                System.out.println("same");
            }
        }
    }

    public static int judge(String str1, String[] str2){
        HashMap<String,String> map = new HashMap<>();
        map.put("J","B");
        map.put("B","S");
        map.put("S","J");
        int res = 0;
        for(int i=0;i<2;i++){
            String s = map.get(str1);
            if(s.equals(str2[i])){
                res++;
            }
        }
        return res;
    }
}