package writtenexamination.test;

import java.util.Scanner;

public class UpDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float[] num = new Float[7];

        int up = 0;
        int down = 0;

        for (int i = 0; i < 7; i++) {
            num[i] = sc.nextFloat();
        }

        for (int i = 0; i < 7; i++) {
            if(num[i] > 0){
                up++;
            }else {
                down++;
            }
        }
        System.out.print(up+","+down);
    }
}
