package writtenexamination.同城58;

import java.util.Scanner;

public class Compress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hang = sc.nextInt();
        int lie = sc.nextInt();

        int[][] matrix = new int[hang][lie];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < lie; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }




    }
}
