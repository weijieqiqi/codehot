package org.example.hot100;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/6/3 13:51 //创建时间
 * @Version: 1.0    //版本号
 * 二分查找
 */
public class BM17 {
    public static int search(int[] nums, int target) {
        // write code here
        if (nums.length == 0) return -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arry = {-1, 0, 3, 4, 6, 10, 13, 14};
        System.out.println(search(arry, 13));
    }
}