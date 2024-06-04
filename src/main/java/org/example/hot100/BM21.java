package org.example.hot100;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/6/3 14:48 //创建时间
 * @Version: 1.0    //版本号
 */
public class BM21 {
    public int minNumberInRotateArray(int[] nums) {
        // write code here
        quickSort(nums);
        return nums[0];
    }

    public void quickSort(int[] nums) {
        if (nums.length == 0) return;
        process(nums, 0, nums.length - 1);
    }

    public void process(int[] nums, int L, int R) {
        if (L > R) return;
        int q1 = pattion(nums, L, R);
        process(nums, L, q1 - 1);
        process(nums, q1 + 1, R);
    }

    public int pattion(int[] nums, int L, int R) {
        if (L > R) return -1;
        if (L == R) return L;
        int less = L - 1;
        int index = L;
        while (index < R) {
            if (nums[index] <= nums[R]) {
                swap(nums, ++less, index);
            }
            index++;
        }
        swap(nums, ++less, R);
        return less;
    }

    public void swap(int[] nums, int L, int R) {
        int temp = nums[L];
        nums[L] = nums[R];
        nums[R] = temp;
    }
}