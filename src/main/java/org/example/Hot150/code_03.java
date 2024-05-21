package org.example.Hot150;

import java.util.HashMap;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/18 11:26 //创建时间
 * @UpdateDate: 2024/3/18 11:26 //更新时间
 * @Version: 1.0    //版本号
 */
public class code_03 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();//key为字符，value为出现的下标
        int left = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}