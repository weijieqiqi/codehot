package org.example.hot100;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/20 9:38 //创建时间
 * @Version: 1.0    //版本号
 * 打家劫舍
 * 你是一个经验丰富的小偷，准备偷沿街的一排房间，每个房间都存有一定的现金，为了防止被发现，
 * 你不能偷相邻的两家，即，如果偷了第一家，就不能再偷第二家；如果偷了第二家，那么就不能偷第一家和第三家。
 * 给定一个整数数组nums，数组中的元素表示每个房间存有的现金数额，请你计算在不被发现的前提下最多的偷窃金额。
 * https://www.nowcoder.com/practice/c5fbf7325fbd4c0ea3d0c3ea6bc6cc79?tpId=295&tqId=2285793&ru=/exam/oj&qru=/ta/format-top101/question-ranking&sourceUrl=%2Fexam%2Foj
 */
public class BM78 {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return nums[0];
        }
        if (len == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < len; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[len - 1];
    }

    /*public int rob2(int[] nums) {
        int[] dp = new int[nums.length];
        return robHelper(nums, nums.length - 1, dp);
    }

    private int robHelper(int[] nums, int index, int[] dp) {
        if (index < 0) {
            return 0;
        }

        if (dp[index] != 0) {
            return dp[index];
        }

        int stealCurrent = nums[index] + robHelper(nums, index - 2, dp);
        int skipCurrent = robHelper(nums, index - 1, dp);

        int ans = Math.max(stealCurrent, skipCurrent);
        dp[index] = ans;

        return ans;
    }*/
}