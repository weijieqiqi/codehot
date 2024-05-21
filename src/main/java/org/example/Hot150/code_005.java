package org.example.Hot150;


import java.util.Arrays;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/1 9:28 //创建时间
 * @UpdateDate: 2024/3/1 9:28 //更新时间
 * @Version: 1.0    //版本号
 */

public class code_005 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    //消消乐算法
    public int majorityElement2(int[] nums) {
        int candition = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                candition = num;
            }
            count += (num == candition) ? 1 : -1;
        }
        return candition;
    }
}