package org.example.hot100;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/24 10:17 //创建时间
 * @Version: 1.0    //版本号
 * https://leetcode.cn/problems/climbing-stairs/?envType=study-plan-v2&envId=top-100-liked
 * 爬楼梯
 */
public class code_070 {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

}