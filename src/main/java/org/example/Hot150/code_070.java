package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/7 10:34 //创建时间
 * @Version: 1.0    //版本号
 */
public class code_070 {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + 1;
        }
        return dp[n];
    }
}