package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/1 9:50 //创建时间
 * @Version: 1.0    //版本号
 * https://leetcode.cn/problems/edit-distance/description/?envType=study-plan-v2&envId=top-interview-150
 * 编辑距离
 * dp[i][j]来表示要使word1[0:i]和word2[0:j]相等，需要修改的最少次数
 */
public class code_072 {
    //方法1：递归
    public static int minDistance(String word1, String word2) {
        if (word1.length() == 0 || word2.length() == 0) {
            return Math.max(word1.length(), word2.length());
        }
        if (word1.charAt(word1.length() - 1) == word2.charAt(word2.length() - 1)) {
            return minDistance(word1.substring(0, word1.length() - 1), word2.substring(0, word2.length() - 1));
        }
        return Math.min(
                minDistance(word1.substring(0, word1.length() - 1), word2.substring(0, word2.length() - 1)),
                Math.min(minDistance(word1, word2.substring(0, word2.length() - 1)), minDistance(word1.substring(0, word1.length() - 1), word2))) + 1;
    }

    public static int minDistance2(String word1, String word2) {
        int lengthi = word1.length();
        int lengthj = word2.length();
        int[][] dp = new int[lengthi + 1][lengthj + 1];
        return process(word1, word2, lengthi, lengthj, dp);
    }

    public static int process(String word1, String word2, int i, int j, int[][] dp) {
        int ans = 0;
        if (i == 0 || j == 0) {
            return Math.max(i, j);
        }

        if (dp[i][j] != 0) {
            return dp[i][j];
        }

        if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
            ans = process(word1, word2, i - 1, j - 1, dp);
        } else {
            ans = Math.min(Math.min(process(word1, word2, i - 1, j, dp), process(word1, word2, i, j - 1, dp)),
                    process(word1, word2, i - 1, j - 1, dp)) + 1;
        }
        dp[i][j] = ans;
        return dp[i][j];
    }

    public static int minDistance3(String word1, String word2) {
        int lengthi = word1.length();
        int lengthj = word2.length();
        int[][] dp = new int[lengthi + 1][lengthj + 1];
        for (int i = 0; i <= lengthi; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i <= lengthj; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i <= lengthi; i++) {
            for (int j = 1; j <= lengthj; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                }
            }
        }

        return dp[lengthi][lengthj];
    }


    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";
        System.out.println(minDistance(word1, word2));
        System.out.println(minDistance2(word1, word2));
        System.out.println(minDistance3(word1, word2));
    }
}