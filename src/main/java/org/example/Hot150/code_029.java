package org.example.Hot150;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/6 10:43 //创建时间
 * @UpdateDate: 2024/3/6 10:43 //更新时间
 * @Version: 1.0    //版本号
 * 三数之和
 * 双指针
 */
public class code_029 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);//排序
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return ans;//因为我们以及排过序了，所有如果此时出现>0的数字，表示已经有答案了
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0){
                    right--;
                }else if(sum < 0){
                    left++;
                }else {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    ans.add(list);
                    while (left < right && nums[right] == nums[right-1]) right--;
                    while (left < right && nums[left] == nums[left+1]) left++;
                    right--;
                    left++;
                }
            }
        }
        return ans;
    }
}