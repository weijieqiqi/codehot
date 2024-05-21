package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/2/29 9:22 //创建时间
 * @UpdateDate: 2024/2/29 9:22 //更新时间
 * @Version: 1.0    //版本号
 */
public class code_002 {
    public int removeElement3(int[] nums, int val) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[right - 1];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }

    public static int removeElement1(int[] nums, int val) {
        int n = nums.length;
        int left = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[left] = nums[i];
                left++;
            }
        }
        return left;
    }
    public static int removeElement2(int[] nums, int val) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[right - 1];
                right--;
            }else {
                left++;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 3};
        System.out.println(removeElement2(nums, 3));
    }
}