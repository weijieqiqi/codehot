package org.example.Hot150;


/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/1 9:56 //创建时间
 * @UpdateDate: 2024/3/1 9:56 //更新时间
 * @Version: 1.0    //版本号
 */
public class code_006 {
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        swap(nums, 0, nums.length - 1);
        swap(nums,0,k-1);
        swap(nums,k, nums.length-1);
    }

    public static void swap(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }

    public static void main(String[] args) {
        int[] sums = {1,2,3,4,5,6,7};
        rotate(sums,3);
    }
}