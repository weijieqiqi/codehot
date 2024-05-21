package org.example.hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/8 9:23 //创建时间
 * @Version: 1.0    //版本号
 * https://leetcode.cn/problems/group-anagrams/?envType=study-plan-v2&envId=top-100-liked
 * 字母异位词分组
 *
 * 先排序，然后存入hash表中，排序相同的存放在一个相同的hash表
 */
public class code_002 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> lists = hashMap.getOrDefault(key, new ArrayList<String>());
            // 如果"key"存在于map中，list 将是 lists
            // 如果"key"不存在，list 将是一个新的空ArrayList<String>
            lists.add(str);
            hashMap.put(key,lists);
        }
        return new ArrayList<List<String>>(hashMap.values());
    }
}