package writtenexamination.中国电信;

import java.util.Scanner;

public class FindIDList {
    public static int count;
    public static void FindID(String s){
        String lab = "aieouAIEOU";
        count = 0;
        for (int i = 0; i < s.length(); i++) {
            String tmp = s.charAt(i)+"";
            if (!lab.contains(tmp)){
                count++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] s = sc.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s[i]);
        }
        FindID(sb.toString());
        System.out.println(count);
    }
}
