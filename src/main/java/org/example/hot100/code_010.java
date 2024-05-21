package org.example.hot100;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/11 9:23 //创建时间
 * @Version: 1.0    //版本号
 * https://leetcode.cn/problems/subarray-sum-equals-k/?envType=study-plan-v2&envId=top-100-liked
 * 和为k的子组数
 */
public class code_010 {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum+=nums[j];
                if (sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}