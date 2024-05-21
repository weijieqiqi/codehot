package org.example.hot100;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/16 9:31 //创建时间
 * @Version: 1.0    //版本号
 * //翻转字符串
 */
public class BM091 {
    public String solve(String str) {
        // write code here
        int len = str.length();
        char[] ans = new char[len];
        for (int i = 0; i < len; i++) {
            ans[i] = str.charAt(len - i - 1);
        }
        return new String(ans);
    }
}