package org.example.hot100;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/19 9:31 //创建时间
 * @Version: 1.0    //版本号
 * https://leetcode.cn/problems/unique-paths/solutions/5772/dong-tai-gui-hua-by-powcai-2/?envType=study-plan-v2&envId=top-100-liked
 * 不同路径
 */
public class code_062 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m-1][n-1];
    }
}