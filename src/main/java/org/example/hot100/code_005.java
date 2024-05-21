package org.example.hot100;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/8 10:22 //创建时间
 * @Version: 1.0    //版本号
 */
public class code_005 {
    public int maxArea(int[] height) {
        int n = height.length;
        if (n < 2) return 0;
        int ans = 0;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int cap = Math.min(height[left], height[right]) * (right - left);
            ans = Math.max(cap,ans);
            if (height[right] < height[left]){
                right--;
            }else {
                left++;
            }
        }
        return ans;
    }
}