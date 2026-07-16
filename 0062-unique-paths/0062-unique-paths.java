class Solution {
    int[][] dp;

    public int uniquePaths(int m, int n) {

        dp = new int[m][n];
        for (int[] row : dp) {
            java.util.Arrays.fill(row, -1);
        }
        
        return helper(0, 0, m, n);
    }

    private int helper(int i, int j, int m, int n) {
        
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        
        if (i >= m || j >= n) {
            return 0;
        }
        
        
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

       
        int right = helper(i, j + 1, m, n);
        int down = helper(i + 1, j, m, n);
        
        dp[i][j] = right + down;
        
        return dp[i][j];
    }
}