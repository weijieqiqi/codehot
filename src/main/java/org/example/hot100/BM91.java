package org.example.hot100;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/23 9:50 //创建时间
 * @Version: 1.0    //版本号
 */
public class BM91 {
    public String solve(String str) {
        // write code here
        char[] nums = new char[str.length()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = str.charAt(nums.length - i - 1);
        }
        return new String(nums);
    }

}