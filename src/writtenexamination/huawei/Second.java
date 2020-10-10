package writtenexamination.huawei;

public class Second {
    public static int midNumber(int[] num1, int[] num2){
        int m = num1.length;
        int n = num2.length;
        int len = m+n;
        int p1 = 1;
        int p2 = 1;
        while ( (p1+p2) < len/2 && p1 <= m && p2 <= n){
            if(num1[p1-1] < num2[p2-1]){
                p1++;
            }else {
                p2++;
            }
        }
        return 1;
    }
}
