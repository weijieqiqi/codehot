package org.example.hot100;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/23 14:48 //创建时间
 * @Version: 1.0    //版本号
 * 数组中只出现一次的两个数字
 * https://www.nowcoder.com/practice/389fc1c3d3be4479a154f63f495abff8?tpId=295&tqId=1375231&ru=/exam/oj&qru=/ta/format-top101/question-ranking&sourceUrl=%2Fexam%2Foj
 */
public class BM52 {
    public static int[] FindNumsAppearOnce(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        int[] array = new int[set.size()];
        int index = 0;
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            array[index++] = iterator.next();
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arrays = {1, 3, 2, 1};
        int[] ints = FindNumsAppearOnce(arrays);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}