package org.example.hot100;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/15 9:52 //创建时间
 * @Version: 1.0    //版本号
 * https://www.nowcoder.com/practice/3d8d6a8e516e4633a2244d2934e5aa47?tpId=295&tqId=2284579&ru=/exam/oj&qru=/ta/format-top101/question-ranking&sourceUrl=%2Fexam%2Foj
 * 盛水最多的容器
 */
public class BM93 {
    public int maxArea(int[] height) {
        // write code here
        int n = height.length;
        if (n < 2) return 0;
        int ans = 0;
        int right = n - 1;
        int left = 0;
        while (left < right){
            int cap = Math.min(height[left],height[right]) * (right-left);
            ans = Math.max(cap,ans);
            if (height[left] < height[right]){
                left++;
            }else {
                right--;
            }
        }
        return ans;
    }
}