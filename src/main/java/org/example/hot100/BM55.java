package org.example.hot100;

import java.util.ArrayList;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/22 9:50 //创建时间
 * @Version: 1.0    //版本号
 */
public class BM55 {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        process(num, 0);
        return ans;
    }

    public void process(int[] nums, int start) {
        if (start == nums.length - 1) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                arrayList.add(nums[i]);
            }
            ans.add(arrayList);
        }
        for (int i = start; i < nums.length; i++) {
            swap(nums, i, start);
            process(nums, start + 1);
            swap(nums, i, start);
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}