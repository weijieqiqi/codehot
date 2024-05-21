package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/27 9:54 //创建时间
 * @Version: 1.0    //版本号
 * https://www.nowcoder.com/practice/f33f5adc55f444baa0e0ca87ad8a6aac?
 * tpId=295&tqId=991150&ru=%2Fexam%2Foj&qru=%2Fta%2Fformat-top101%2Fquestion-ranking&sourceUrl=%2Fexam%2Foj&dayCountBigMember=365%E5%A4%A9
 * 最长公共子串
 * dp[i][j]表示在str1中以第i个字符结尾在str2中以第j个字符结尾时的公共子串长度
 */
public class code_Bm66 {
    public String LCS(String str1, String str2) {
        // write code here
        int M = str1.length();
        int N = str2.length();
        int maxnum = 0;
        int end = 0;
        int[][] dp = new int[M + 1][N + 1];
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = 0;
                }
                if (dp[i][j] > maxnum) {
                    maxnum = dp[i][j];//记录长度
                    end = i;//记录结束的位置
                }
            }
        }
        return str1.substring(end - maxnum, end);
    }

    public static void main(String[] args) {
        String s1 = "abcdefg";
        String substring = s1.substring(1, 4);
        System.out.println(substring.toString());
    }
}