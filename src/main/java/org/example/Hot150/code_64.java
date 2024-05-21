package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/7 9:33 //创建时间
 * @Version: 1.0    //版本号
 * https://leetcode.cn/problems/minimum-path-sum/?envType=study-plan-v2&envId=top-interview-150
 * 最小路径和
 */
public class code_64 {

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            dp[i][0] = grid[i][0] + dp[i - 1][0];
        }
        for (int j = 1; j < n; j++) {
            dp[0][j] = grid[0][j] + dp[0][j - 1];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[m - 1][n - 1];
    }
}