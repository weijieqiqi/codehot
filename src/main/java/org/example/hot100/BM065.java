package org.example.hot100;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/21 16:14 //创建时间
 * @Version: 1.0    //版本号
 */
public class BM065 {
    public String LCS(String s1, String s2) {
        // write code here
        if (s1.length() == 0 || s2.length() == 0 || s1 == null || s2 == null) {
            return "-1";
        }

        int len = s1.length();
        int len2 = s2.length();
        String[][] dp = new String[len + 1][len2 + 1];

        for (int i = 0; i <= len; i++) {
            dp[i][0] = "";
        }
        for (int i = 0; i <= len2; i++) {
            dp[0][i] = "";
        }

        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= len2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + s1.charAt(i - 1);
                } else {
                    dp[i][j] = dp[i - 1][j].length() > dp[i][j - 1].length() ? dp[i - 1][j] : dp[i][j - 1];
                }
            }
        }
        return dp[len][len2].equals("") ? "-1" : dp[len][len2];
    }

    public String LCS2(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() == 0 || s2.length() == 0) {
            return "-1";
        }

        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        int m = str1.length;
        int n = str2.length;

        String[][] dp = new String[m + 1][n + 1]; // dp数组存储中间结果

        // 初始化第一行和第一列
        for (int i = 0; i <= m; i++) {
            dp[i][0] = "";
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = "";
        }

        // 填充dp数组
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1[i - 1] == str2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + str1[i - 1];
                } else {
                    dp[i][j] = dp[i - 1][j].length() > dp[i][j - 1].length() ? dp[i - 1][j] :
                            dp[i][j - 1];
                }
            }
        }

        return dp[m][n].equals("") ? "-1" : dp[m][n]; // 返回结果
    }

}