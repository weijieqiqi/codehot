package org.example.Hot150;


/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/6 10:36 //创建时间
 * @UpdateDate: 2024/3/6 10:36 //更新时间
 * @Version: 1.0    //版本号
 * 盛最多水的容器
 * 贪心的思想
 */
public class code_028 {
    public int maxArea(int[] height) {
        int n = height.length;
        if (n < 2){
            return 0;
        }
        int ans = 0;
        int left = 0;
        int right = n-1;
        while (left < right){
            int cap = Math.min(height[left],height[right]) * (right - left);
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