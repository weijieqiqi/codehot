package org.example.hot100;

import java.util.HashSet;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/23 13:55 //创建时间
 * @Version: 1.0    //版本号
 */
public class BM53 {
    public int minNumberDisappeared(int[] nums) {
        // write code here
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int res = 1;
        while (set.contains(res)) {
            res++;
        }
        return res;
    }
}