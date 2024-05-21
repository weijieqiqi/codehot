package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/27 9:15 //创建时间
 * @Version: 1.0    //版本号
 * https://leetcode.cn/problems/longest-common-subsequence/description/
 * 最长公共子序列
 * 其中 dp[i][j]表示text[0:i]和text2[0:j]的最长公共子序列
 * text[0:i]表示长度为i的前缀 ；text2[0:j]表示长度为j的前缀
 * 样本对应模型
 */
public class code_1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;//-1是因为字符串的下标是0开始
                } else {
                    dp[i][j] = Math.max(dp[i -  1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
}