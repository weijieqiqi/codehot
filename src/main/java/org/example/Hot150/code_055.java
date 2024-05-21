package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/26 9:29 //创建时间
 * @Version: 1.0    //版本号
 * 跳跃游戏:https://leetcode.cn/problems/jump-game/description/?envType=study-plan-v2&envId=top-interview-150
 * 直接遍历所有点，如果当前点比前面所有点可以达到的点的最大距离还要大就返回false
 * 如果能遍历到最后一个点，说明最后一个点可以到达，返回true
 */
public class code_055 {
    public static boolean canJump(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > k) return false;
            k = Math.max(k,i+nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }
}