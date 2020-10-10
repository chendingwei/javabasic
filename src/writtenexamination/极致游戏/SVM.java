package writtenexamination.极致游戏;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SVM {
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        String start = s1[0];
        String end = s1[1];
        int n = sc.nextInt();
        s = sc.nextLine();
        String[] statues = s.split(" ");
        for (int i = 0; i < n; i++) {
            int length = start.length();
            String substring = statues[i].substring(length - 1, statues[i].length() - 1);
            ans.add(substring.substring(0,2));
            start = substring.substring(3,4);
        }
        for (String an : ans) {
            System.out.print(an);
        }
    }
}
