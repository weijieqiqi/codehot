package org.example.hot100;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/17 10:10 //创建时间
 * @Version: 1.0    //版本号
 */
public class BM_084 {
    public String longestCommonPrefix(String[] strs) {
        // write code here
        int len = strs.length;
        if (len == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < len; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }


}