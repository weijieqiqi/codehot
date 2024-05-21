package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/2/28 16:53 //创建时间
 * @UpdateDate: 2024/2/28 16:53 //更新时间
 * @Version: 1.0    //版本号
 * 合并两个有序数组
 */
public class code_001 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0, p2 = 0;
        int[] ints = new int[m + n];
        int cur;
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            } else if (p2 == n) {
                cur = nums1[p1++];
            } else if (nums1[p1] < nums2[p2]) {
                cur = nums1[p1++];
            } else {
                cur = nums2[p2++];
            }
            ints[p1 + p2 - 1] = cur;
        }
        
        for (int i = 0; i != m + n; ++i) {
            nums1[i] = ints[i];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
    }
}