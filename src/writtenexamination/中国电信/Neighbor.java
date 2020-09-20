package writtenexamination.中国电信;

import java.util.Scanner;

public class Neighbor {
    public static int[] neighbor;
    public static int[] nextDay;
    public static int[] res;
    public static int n;
    public static void activate(int[] nei, int n){
        int len = nei.length;
        neighbor = new int[len+2];
        System.arraycopy(nei,0,neighbor,1,len);
        for (int i = 0; i < n; i++) {
            nextDay = new int[len+2];
            for (int j = 1; j <= len; j++) {
                if(neighbor[j-1] == neighbor[j+1]){
                    nextDay[j] = 0;
                }else {
                    nextDay[j] = 1;
                }
            }
            neighbor = nextDay;
        }
        res = new int[len];
        System.arraycopy(nextDay,1,res,0,len);
    }

    public static void main(String[] args) {
        Neighbor nb = new Neighbor();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] nei = new int[8];
        for (int i = 0; i < 8; i++) {
            nei[i] = Integer.parseInt(s.substring(i,i+1));
        }
        int n = sc.nextInt();
        activate(nei,n);
        for (int i : res) {
            System.out.print(i);
        }
    }
}
