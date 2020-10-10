package interviewguide.dp;

public class ExchangeMoney {
    public int exchange(int[] arr, int aim){
        int rows = arr.length;
        int max = Integer.MAX_VALUE;
        int[][] dp = new int[rows][aim+1];
        for (int i = 1; i <= aim; i++) {
            dp[0][i] = max;
            if(i-arr[0] >= 0 && dp[0][i-arr[0]] != max ){
                dp[0][i] = dp[0][i-arr[0]]+1;
            }
        }
        int left = 0;
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j <= aim ; j++) {
                left = max;
                if(j-arr[i] >=0 && dp[i][j-arr[i]] != max){
                    left = dp[i][j-arr[i]] + 1;
                }
                dp[i][j] = Math.min(left,dp[i-1][j]);
            }
        }
        return dp[rows-1][aim] != max ? dp[rows-1][aim]:-1;
    }

    public static void main(String[] args) {
        int[] arr = {5};
        int aim = 3;
        ExchangeMoney ex = new ExchangeMoney();
        int exchange = ex.exchange(arr, aim);
        System.out.println(exchange);
    }
}
