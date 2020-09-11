package leetcode.arraylist;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TheKthArray {
    public String getPermutation(int n, int k) {
        List<String> ans = new ArrayList<>();
        StringBuilder combine = new StringBuilder();
        boolean[] used = new boolean[n];
        int begin = ensureStart(n, k, used, combine);
        dfs(n,used,1,ans,combine);
        return ans.get(k-begin-1);
    }

    public int ensureStart(int n,int k,boolean[] used, StringBuilder combine){
        int fact = factorial(n-1);
        int begin = 0;
        for (int i = 0; i < n ; i++) {
            if( i*fact <= k && (i+1)*fact >=k){
                used[i] = true;
                combine.append(i+1);
                begin = i * fact;
                break;
            }
        }
        return begin;
    }

    public int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public void dfs(int n, boolean[] used, int len, List<String> ans,StringBuilder combine){
        if(len == n){
            ans.add(new String(combine));
            return;
        }

        for (int i = 0; i < n ; i++) {
            if(!used[i]) {
                combine.append(i+1);
                used[i] = true;

                dfs(n, used, len + 1, ans, combine);

                combine.deleteCharAt(combine.length() - 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        TheKthArray theKthArray = new TheKthArray();
//        List<String> permutation = theKthArray.getPermutation(9, 296662);
//        System.out.println(theKthArray.factorial(9));
//        for (String s : permutation) {
//            System.out.println(s);
//        }
//        theKthArray.ensureStart(9);
    }
}
