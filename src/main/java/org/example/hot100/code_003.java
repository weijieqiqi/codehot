package org.example.hot100;

import java.util.HashSet;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/8 9:54 //创建时间
 * @Version: 1.0    //版本号
 * https://leetcode.cn/problems/longest-consecutive-sequence/solutions/276931/zui-chang-lian-xu-xu-lie-by-leetcode-solution/?envType=study-plan-v2&envId=top-100-liked
 * 最长连续序列
 */
public class code_003 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> num_set = new HashSet<>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longsize = 0;
        for (int num : num_set) {
            if (!num_set.contains(num - 1)) {
                int currentnum = num;
                int currstack = 1;//本身自己算一个
                while (num_set.contains(currentnum + 1)) {
                    currentnum += 1;
                    currstack += 1;
                }

                longsize = Math.max(currstack, longsize);
            }
        }
        return longsize;
    }
}