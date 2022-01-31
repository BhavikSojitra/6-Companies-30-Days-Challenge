class Solution {
    static int maxProfit(int K, int N, int A[]) {
        int dp[][] = new int[K+1][N];
        for(int i = 1; i < K + 1; i++){
            int maxi = Integer.MIN_VALUE;
            for(int j = 1; j < N; j++){
                maxi = Math.max(maxi, dp[i - 1][j - 1] - A[j - 1]);
                dp[i][j] = Math.max(maxi + A[j], dp[i][j - 1]);
            }
        }
        return dp[K][N - 1];
    }
}
