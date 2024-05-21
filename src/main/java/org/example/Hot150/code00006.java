package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/2 10:06 //创建时间
 * @Version: 1.0    //版本号
 * <p>
 * 最长回文子序列
 */
public class code00006 {
    public int longestPalindromeSubseq(String s) {
        String s1 = reverseString(s);
        int m = s.length();
        int n = s1.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == s1.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    public String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }

}