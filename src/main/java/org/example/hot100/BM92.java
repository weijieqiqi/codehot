package org.example.hot100;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/26 10:32 //创建时间
 * @Version: 1.0    //版本号
 * https://www.nowcoder.com/practice/b56799ebfd684fb394bd315e89324fb4?tpId=295&tqId=1008889&ru=/exam/company&qru=/ta/format-top101/question-ranking&sourceUrl=%2Fexam%2Fcompany
 * 最长无重复子数组
 */
public class BM92 {
    public int maxLength (int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        int res = 0;
        for (int i : arr) {
            while (queue.contains(i)){
                queue.poll();
            }
            queue.add(i);
            res = Math.max(res,queue.size());
        }
        return res;
    }

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        Queue<Character> queue = new LinkedList<>();
        int res = 0;
        for (char i : chars) {
            while (queue.contains(i)){
                queue.poll();
            }
            queue.add(i);
            res = Math.max(res,queue.size());
        }
        return res;
    }
}