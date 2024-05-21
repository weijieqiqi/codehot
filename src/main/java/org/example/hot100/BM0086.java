package org.example.hot100;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/16 10:06 //创建时间
 * @Version: 1.0    //版本号
 */
public class BM0086 {
    public static String solve(String s, String t) {
        // write code here
        int i = s.length() - 1;
        int j = t.length() - 1;
        int asr = 0;//存储进位
        StringBuilder ans = new StringBuilder();
        while (i >= 0 || j >= 0 || asr > 0) {
            int n1 = i >= 0 ? s.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? t.charAt(j) - '0' : 0;
            int sum = n1 + n2 + asr;
            asr = sum / 10;
            ans.insert(0, sum % 10);
            i--;
            j--;
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "3";
        String t = "99";
        System.out.println(solve(s, t));
    }
}