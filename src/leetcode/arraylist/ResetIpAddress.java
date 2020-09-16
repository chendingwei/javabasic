package leetcode.arraylist;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ResetIpAddress {
    public List<String> restoreIpAddresses(String s){
        int len = s.length();
        List<String> ans = new ArrayList<>();
        if(len <4 || len >12){
            return ans;
        }
        Deque<String> path = new ArrayDeque<>();
        dfs(s,0,0,ans,path);
        return ans;
    }

    public void dfs(String s, int splitTime, int begin, List<String> ans, Deque<String> path){
        if(begin == s.length()){
            if(splitTime == 4){
                ans.add(String.join(".",path));
            }
            return;
        }
        // 如果剩下的字符数小于ip地址的剩余段数 || 剩下字符数大于剩下ip地址的最大长度
        if(s.length() - begin < (4-splitTime) || s.length() - begin > 3*(4-splitTime)){
            return;
        }

        for (int i = 0; i < 3; i++) {
            if(begin + i >= s.length()){
                break;
            }

            int ipSegment = isIpSegment(s, begin, begin + i);
            if(ipSegment != -1){
                path.addLast(ipSegment+"");

                dfs(s,splitTime+1,begin+i+1,ans,path);

                path.removeLast();
            }
        }
    }

    public int isIpSegment(String s, int begin, int end){
        int len = end - begin+1;
        if(len >1 && s.charAt(begin) == '0' ){
            return -1;
        }
        int address = 0;
        for (int i = begin; i <= end; i++) {
            address = address * 10 + s.charAt(i) - '0';
        }

        if (address > 255){
            return -1;
        }
        return address;
    }
}
