package writtenexamination.NetEase;

import java.util.ArrayList;
import java.util.List;

/*
5 "34561245892364388201628"

out
34 + 56 +12 +45 +89 = 236;
56 + 12 + 45 +89 + 236 = 438;
12 + 45 + 89 +236 +438 = 820;
45 + 89 +236 + 438 +820 = 1628;
  */
public class StringToArray {
    public int[] split_into_list (int N, String S) {
        // write code here
        int len =1;
        int res;
        int point = 0;
        while (true){
            res = 0;
            for(int i=0;i<N;i++){
                res += Integer.parseInt(S.substring(i*len,(i+1)*len));
            }
            int bit = (res + "").length();
            int sum = Integer.parseInt(S.substring(N*len,N*len+bit));
            if(res != sum){
                len ++;
            }else {
                break;
            }
        }
        List<Integer> ans = new ArrayList<>();
        while (point < S.length()-1){
            if(ans.size() <= N){
                ans.add(Integer.parseInt(S.substring(point,point+len)));
                point += len;
            }else {
                int sum = 0;
                for (int i = 1; i <= N; i++) {
                    sum += ans.get(ans.size()-i);
                }
                int bit = (sum+"").length();
                ans.add(Integer.parseInt(S.substring(point,point+bit)));
                point += bit;
            }
        }
        int[] ints = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            ints[i] = ans.get(i);
        }
        return ints;
    }
}
