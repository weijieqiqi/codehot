package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/25 15:25 //创建时间
 * @Version: 1.0    //版本号
 */
public class coetest4 {
    public static int number(String str) {
        if (str == null || str.length() == 0)
            return 0;
        return process(str.toCharArray(), 0);
    }


    //str[0,i-1]无需过问
    //str[i.....]去转换
    public static int process(char[] str, int i) {
        if (i == str.length) {
            return 1;//返回之前做的决定
        }
        //i没有到最后
        if (str[i] == '0') {
            return 0;
        }
        int ways = process(str, i + 1);
        if (i + 1 < str.length && (str[i] - '0') * 10 + str[i + 1] - '0' < 27) {
            ways += process(str, i + 2);
        }
        return ways;
    }

    public static int dp(String str) {
        if (str == null || str.length() == 0)
            return 0;
        char[] chars = str.toCharArray();
        int n = chars.length;
        int[] dp = new int[n + 1];
        dp[n] = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (chars[i] != '0') {
                int ways = dp[i + 1];
                if (i + 1 < chars.length && (chars[i] - '0') * 10 + chars[i + 1] - '0' < 27) {
                    ways += dp[i + 2];
                }
                dp[i] = ways;
            }

        }
        return dp[0];
    }

    public static void main(String[] args) {
        System.out.println(number("111"));
        System.out.println(dp("111"));
    }
}