package org.example.Hot150;

import java.util.HashMap;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/2 9:41 //创建时间
 * @Version: 1.0    //版本号
 * 两数之和
 * https://leetcode.cn/problems/two-sum/?envType=study-plan-v2&envId=top-interview-150
 */
public class code001 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        int[] ints = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int res = target - nums[i];
            //key 为值，value为下标
            if (!ans.containsKey(res)){
                ans.put(nums[i],i);
            }else {
                ints[0] = ans.get(res);
                ints[1] = i;
            }
        }
        return ints;
    }
}