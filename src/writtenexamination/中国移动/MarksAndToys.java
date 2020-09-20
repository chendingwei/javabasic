package writtenexamination.中国移动;


import java.util.Arrays;
import java.util.Scanner;

public class MarksAndToys {
    public int[] prices;
    public int n;
    public int k;
    public int kinds = 0;
    public void dpMethod(int n, int k, int[] prices){
        this.n = n;
        this.k = k;
        if(this.k == 0){
            kinds = 0;
            return;
        }
        Arrays.sort(prices);
        dfs(k,0,prices);
    }

    public void dfs(int k, int kinds, int[] prices){
        if(k < prices[kinds]){
            this.kinds = kinds;
            return ;
        }
        if(k <= 0){
            this.kinds = kinds -1;
            return ;
        }

        dfs(k - prices[kinds],kinds+1,prices);
    }

    public static void main(String[] args) {
        MarksAndToys mk = new MarksAndToys();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        mk.dpMethod(n,k,prices);

        System.out.println(mk.kinds);
    }
}
