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
        for(int i=0;i<row;i++){
            if(tower[i][1] == 0){
                res+=tower[i][0];
            }
        }

        for(int j=0; j<row;j++) {
            int max_index = 0;
            for (int i = 0; i < row; i++) {
                if (tower[i][1] == 1) {
                    if (tower[i][0] > max_index) {
                        max_index = i;
                    }
                }
            }
            if (res > tower[max_index][0]) {
                res = 2 * res;
            } else {
                res += tower[max_index][0];
            }
            tower[max_index][1] = 0;
        }
        System.out.println(res);
    }
}
