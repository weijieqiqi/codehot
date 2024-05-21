package org.example.Hot150;

import java.util.HashMap;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/1 10:46 //创建时间
 * @UpdateDate: 2024/3/1 10:46 //更新时间
 * @Version: 1.0    //版本号
 */
public class code_027 {
    //方法1：暴力枚举,超时
    public int[] twoSum1(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1,j + 1};
                }
            }
        }
        return new int[0];
    }

    //方法2：哈希
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        if(numbers == null || numbers.length == 0){
            return ans;
        }
        //key为值，value为下标
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int temp = target-numbers[i];
            if (map.containsKey(temp)){
                ans[0] = map.get(temp)+1;
                ans[1] = i+1;
            }else {
                map.put(numbers[i],i);
            }
        }
        return ans;
    }
}