package org.example.hot100;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/17 10:00 //创建时间
 * @Version: 1.0    //版本号
 */
public class code_072 {
    public int minDistance(String word1, String word2) {
        int leni = word1.length();
        int lenj = word2.length();
        int[][] dp = new int[leni + 1][lenj + 1];
        for (int i = 0; i <= leni; i++) {
            dp[i][0] = i;
        }

        for (int j = 0; j <= lenj; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= leni; i++) {
            for (int j = 1; j <= lenj; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {//最后一位相同，看前退一位的结果
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    //dp[i][j-1]删除操作
                    //dp[i-1][j]插入操作
                    //dp[i-1][j-1]置换操作
                    dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;
                }
            }
        }
        return dp[leni][lenj];
    }

    public static void main(String[] args) {
        String a = "abc";
        char c = a.charAt(2);
        System.out.println(c);
    }

}