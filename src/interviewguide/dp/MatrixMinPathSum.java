package interviewguide.dp;

public class MatrixMinPathSum {
    public int minPathSum(int[][] m){
        int rows = m.length;
        int cols = m[0].length;
        int[][] dp = new int[rows][cols];
        dp[0][0] = m[0][0];
        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i-1][0] + m[i][0];
        }

        for (int i = 0; i < cols; i++) {
            dp[0][i] = dp[0][i-1] + m[0][i];
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) + m[i][j];
            }
        }
        return dp[rows-1][cols-1];
    }
}
