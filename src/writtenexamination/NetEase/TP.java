package writtenexamination.NetEase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        List<Integer> ans = new ArrayList<>();
        int cost = tp(start,end,0,ans);
        System.out.println(cost);
        System.out.println(ans.size());
        for (Integer an : ans) {
            System.out.print(an+" ");
        }
        System.out.println();
    }

    public static int tp(int start, int end,int cost, List<Integer> ans){
        if(start == end){
            cost = 0;
            ans.add(start);
            return cost;
        }
        ans.add(start);
        ans.add(end);
        int now = start;
        while (end % now != 0) {
            cost += 1;
            if ((end%(now+1)) > (end % (now-1))) {
                now--;
            }else {
                now++;
            }
        }
        if(now != end) {
            ans.add(ans.size() - 1, now);
        }
        return cost;
    }
}
