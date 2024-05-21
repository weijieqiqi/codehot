package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/7 11:04 //创建时间
 * @Version: 1.0    //版本号
 */
public class BM_064 {
    public int minCostClimbingStairs(int[] cost) {
        // write code here
        int len = cost.length;
        int[] dp = new int[len + 1];
        if (len == 1) {
            return cost[0];
        }
        if (len == 2) {
            return Math.min(cost[0], cost[1]);
        }
        for (int i = 2; i <= len; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[len];
    }
}