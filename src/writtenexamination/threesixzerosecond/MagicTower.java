package writtenexamination.threesixzerosecond;

import java.util.Scanner;

public class MagicTower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int[][] tower = new int[row][2];
        for(int i=0;i<row;i++){
            tower[i][0] = sc.nextInt();
            tower[i][1] = sc.nextInt();
        }
        int res=0;
        int index = 0;
        for(int i=0;i<row;i++){
            if(tower[i][1] == 0){
                res+=tower[i][0];
                int[] temp = tower[i];
                tower[i] = tower[index];
                tower[index] = temp;
                index++;
            }
        }

        for(int j=index; j<row;j++) {
            int max_index = j;
            for (int i = j; i < row; i++) {
                if (tower[i][0] > tower[max_index][0]) {
                    max_index = i;
                }
            }
            if (res > tower[max_index][0]) {
                res = 2 * res;
            } else {
                res += tower[max_index][0];
            }
            tower[max_index][1] = 0;

            int[] temp = tower[max_index];
            tower[max_index] = tower[j];
            tower[j] = temp;
        }
        System.out.println(res);
    }
}
