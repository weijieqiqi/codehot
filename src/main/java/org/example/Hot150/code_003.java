package org.example.Hot150;

import java.util.Arrays;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/2/29 10:12 //创建时间
 * @UpdateDate: 2024/2/29 10:12 //更新时间
 * @Version: 1.0    //版本号
 */
public class code_003 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums == null) return 0;
        int p = 1;
        int q = 1;
        while (q < nums.length){
            if(nums[p-1] != nums[q]){
                nums[p] = nums[q];
                p++;
            }else {
                q++;
            }
        }
        return p;
    }

    public static int[] removeDuplicates1(int[] nums) {
        if (nums.length == 0 || nums == null) return new int[0]; // 返回空数组，原数组为空或者为null的情况
        int[] result = new int[nums.length]; // 创建一个新数组，长度和原数组相同
        int p = 1; // 新数组的索引
        int q = 1; // 原数组的索引
        result[0] = nums[0]; // 将第一个元素复制到新数组中
        while (q < nums.length){
            if(nums[p-1] != nums[q]){
                result[p] = nums[q]; // 将不重复的元素复制到新数组中
                p++;
            }
            q++;
        }
        // 返回新数组，长度为p
        return Arrays.copyOf(result, p-1);
    }


    public static void main(String[] args) {
        int[] nums = {2,2,3,3};
        int[] ints = removeDuplicates1(nums);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

}