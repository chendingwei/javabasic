package writtenexamination.中国移动;

import java.util.Scanner;

public class CounterGame {
    public static String user1 = "Louise";
    public static String user2 = "Richard";

    public static String counterGame(int N){
        double minPow = 1;
        int times = 0;
        while (N != 1) {
            for (int i = 0; i < 64; i++) {
                if (Math.pow(2, i) <= N && Math.pow(2, i + 1) >= N) {
                    minPow = Math.pow(2, i);
                    break;
                }
            }
            if (N == minPow || N == 2*minPow){
                N = N/2;
            }else {
                N -= minPow;
            }
            times++;
        }
        if (times % 2==0 ){
            return user2;
        }else {
            return user1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            String s = counterGame(N);
            System.out.println(s);
        }
    }
}
