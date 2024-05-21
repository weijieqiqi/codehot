package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/2/29 10:55 //创建时间
 * @UpdateDate: 2024/2/29 10:55 //更新时间
 * @Version: 1.0    //版本号
 */
public class code_004 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        int slow = 2, fast = 2;
        while (fast < n) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow]  = nums[fast];
                slow++;
            }
            fast++;

        }
        return slow;
    }
}