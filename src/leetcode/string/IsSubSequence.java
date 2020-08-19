package leetcode.string;

public class IsSubSequence {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        int n=s.length(), m = t.length();

        while(i<n && j<m){
            if(s.charAt(i) == (t.charAt(j))){
                i++;
            }
            j++;
        }
        return i==n;
    }
}
