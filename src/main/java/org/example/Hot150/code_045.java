package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/26 9:46 //创建时间
 * @Version: 1.0    //版本号
 * https://leetcode.cn/problems/jump-game-ii/?envType=study-plan-v2&envId=top-interview-150
 */
public class code_045 {
    public int jump(int[] nums) {
        int ans = 0;
        int end = 0;
        int maxpos = 0;
        for (int i = 0; i < nums.length-1; i++) {
            maxpos = Math.max(maxpos,nums[i] + i);
            if (i == end){
                end = maxpos;
                ans++;
            }
        }
        return ans;
    }
}