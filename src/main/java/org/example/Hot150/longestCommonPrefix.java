package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/12 16:39 //创建时间
 * @UpdateDate: 2024/3/12 16:39 //更新时间
 * @Version: 1.0    //版本号
 */
public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n == 0 ){
            return "";
        }

        for (int i = 0; i < strs[0].length(); i++) {
            int c = strs[0].charAt(i);
            for (int j = 1; j < n; j++) {
                if (i == strs[j].length() || c != strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}