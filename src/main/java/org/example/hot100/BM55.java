package org.example.hot100;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

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




    HashSet<String> set = new HashSet<>();
    ArrayList<String> ans2 = new ArrayList<>();
    public ArrayList<String> Permutation (String str) {
        String[] chars = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            chars[i] = String.valueOf(str.charAt(i));
        }

        process(chars, 0);
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            ans2.add(iterator.next());
        }
        return ans2;
    }

    public void process(String [] num, int start) {
        if (start == num.length - 1) {
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < num.length; i++) {
                ans.append(num[i]);
            }
            set.add(new String(ans));
        }
        for (int i = start; i < num.length; i++) {
            swap(num, i, start);
            process(num, start + 1);
            swap(num, i, start);
        }
    }
    public void swap(String[] num, int i, int j) {
        String temp;
        temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}