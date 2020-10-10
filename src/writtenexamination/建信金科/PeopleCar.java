package writtenexamination.建信金科;

/**
 * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
 *
 * @param cars int整型一维数组 车辆数量
 * @param num int整型 出游总人数
 * @return int整型
 */

public class PeopleCar {
    public int carsTrans (int[] cars, int num) {
        // write code here
        int rows = cars.length;
        int cols = num+1;
        int max = Integer.MAX_VALUE;
        int[][] dp =new int[rows][cols];
        for (int j = 0; j <= num ; j++) {
            dp[0][j] = max;
            if(j-cars[0] >= 0 && dp[0][j-cars[0]] != max) {
                dp[0][j] = dp[0][j - cars[0]] + 1;
            }
        }
        int left = 0;
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                left = max;
                if(j-cars[i] >= 0 && dp[i][j-cars[i]] != max){
                    left = dp[i][j-cars[i]] + 1;
                }
                dp[i][j] = Math.min(left, dp[i-1][j]);
            }
        }
        return dp[rows-1][cols-1] != max? dp[rows-1][cols-1] : -1;
    }
}
