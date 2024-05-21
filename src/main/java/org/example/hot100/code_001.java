package org.example.hot100;

import java.util.HashMap;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/8 9:23 //创建时间
 * @Version: 1.0    //版本号
 */
public class code_001 {
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