package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/2 10:05 //创建时间
 * @Version: 1.0    //版本号
 * https://leetcode.cn/problems/longest-palindromic-substring/description/?envType=study-plan-v2&envId=top-interview-150
 * 最长回文子串
 */
public class code0005 {
    public String longestPalindrome(String s) {
        // write code here
        String s1 = reverseString(s);
        int M = s.length();
        int N = s1.length();
        int maxnum = 0;
        int end = 0;
        int[][] dp = new int[M + 1][N + 1];
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                if (s.charAt(i - 1) == s1.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = 0;
                }
                if (dp[i][j] > maxnum) {
                    maxnum = dp[i][j];//记录长度
                    end = i - 1;//记录结束的位置
                }
            }
        }
        return s.substring(end - maxnum + 1, end + 1);
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