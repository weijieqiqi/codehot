package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/1 10:28 //创建时间
 * @UpdateDate: 2024/3/1 10:28 //更新时间
 * @Version: 1.0    //版本号
 */
public class code_026 {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;
    }
}