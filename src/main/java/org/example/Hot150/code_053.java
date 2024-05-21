package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/25 9:36 //创建时间
 * @UpdateDate: 2024/3/25 9:36 //更新时间
 * @Version: 1.0    //版本号
 */
public class code_053 {
    public int maxSubArray(int[] nums) {
        int dp = nums[0];
        int max = dp;
        for (int i = 1; i < nums.length; i++) {
            dp = Math.max(dp + nums[i] , nums[i]);
            max = Math.max(dp,max);
        }
        return max;
    }
}