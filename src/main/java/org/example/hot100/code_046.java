package org.example.hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/26 13:39 //创建时间
 * @Version: 1.0    //版本号
 */
public class code_046 {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        processes(nums, 0);
        return ans;
    }

    public void processes(int[] nums, int start) {
        if (start == nums.length - 1) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
            ans.add(list);
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, i, start);
            processes(nums, start + 1);
            swap(nums, i, start);
        }
    }

    public void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}