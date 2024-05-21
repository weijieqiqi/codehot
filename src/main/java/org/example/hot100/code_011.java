package org.example.hot100;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/10 10:20 //创建时间
 * @Version: 1.0    //版本号
 */
public class code_011 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> integers = new ArrayList<>();
        int len = nums.length;
        int index = 0;
        if (len < 1 || nums == null || len < k) {
            return null;
        }
        LinkedList<Integer> list = new LinkedList<>();
        int[] ans = new int[len - k + 1];
        for (int i = 0; i < len; i++) {
            while (!list.isEmpty() && nums[list.peekLast()] <= nums[i]) {
                list.pollLast();
            }
            list.addLast(i);

            if (list.peekFirst() == i - k) {
                list.pollFirst();
            }

            if (i >= k - 1) {
                ans[index++] = nums[list.peekFirst()];
            }
        }
        return ans;
    }
}