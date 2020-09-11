package writtenexamination.贝壳;

import java.util.Scanner;

public class BuildString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        int maxSubLen = findMaxLenSubString(str);
        if(maxSubLen != 0){
            System.out.println(len - maxSubLen+1);
        }else {
            System.out.println(len);
        }
    }

    public static int findMaxLenSubString(String str){
        int res =0;
        int len = str.length();
        boolean[] dp = new boolean[len/2];
        for(int i = 1;i<=len/2;i++){
            for(int j = 0;j<=len-2*i;j++){
                String substring1 = str.substring(j, j + i);
                String substring2 = str.substring(j + i, j + 2 * i);
                if(substring1.equals(substring2)){
                    dp[i-1] = true;
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            if(dp[i]){
                res = i+1;
            }
        }
        return res;
    }
}
