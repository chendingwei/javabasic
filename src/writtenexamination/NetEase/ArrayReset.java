package writtenexamination.NetEase;

import java.util.Scanner;

/*
N =3;
A = 123;
B = 322;

out 223;
 */
public class ArrayReset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.nextLine());
        String A = sc.nextLine();
        String B = sc.nextLine();
        StringBuilder sb = new StringBuilder(B);
        sort(sb,0,len);
        arrayReset(len,A,sb);
        System.out.println(sb.toString());
    }
    public static void arrayReset(int N, String A, StringBuilder B){
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                if(B.charAt(j) >= A.charAt(i)){
                    char tmp = B.charAt(j);
                    B.setCharAt(j,B.charAt(i));
                    B.setCharAt(i,tmp);
                }
            }
        }
    }

     public static void sort(StringBuilder B, int lo, int hi){
        if(lo >= hi){
            return;
        }
        int mid = partition(B,lo,hi);
        sort(B,lo,mid-1);
        sort(B,mid+1,hi);
     }

     public static int partition(StringBuilder B, int lo, int hi){
        char point = B.charAt(lo);
        int left = lo;
        int right = hi;
        while (true){
            while (point > B.charAt(--right)){
                if(right == lo){
                    break;
                }
            }
            while (point <= B.charAt(++left)){
                if(left == hi){
                    break;
                }
            }

            if(left >= right){
                char tmp = B.charAt(right);
                B.setCharAt(right,B.charAt(lo));
                B.setCharAt(lo,tmp);
                break;
            }else {
                char tmp = B.charAt(left);
                B.setCharAt(left,B.charAt(right));
                B.setCharAt(right,tmp);
            }
        }
        return right;
     }
}
