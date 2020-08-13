package others;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (s.nextLine()!=null){
            sb.append(s.nextLine());
        }

        System.out.println(sb);
    }
}
