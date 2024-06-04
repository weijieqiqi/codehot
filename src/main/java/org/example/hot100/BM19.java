package org.example.hot100;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/6/3 14:09 //创建时间
 * @Version: 1.0    //版本号
 * 寻找峰值--返回的是下标
 */
public class BM19 {
    public int findPeakElement(int[] nums) {
        // write code here
        int len = nums.length;
        if (len == 1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[len - 2] < nums[len - 1]) return len - 1;
        int left = 0, right = len - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                return mid;
            } else if (nums[mid] > nums[mid - 1]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return -1;
    }
}