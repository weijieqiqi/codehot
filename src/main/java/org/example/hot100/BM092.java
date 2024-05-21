package org.example.hot100;

import java.util.LinkedList;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/15 10:37 //创建时间
 * @Version: 1.0    //版本号
 * https://www.nowcoder.com/practice/b56799ebfd684fb394bd315e89324fb4?tpId=295&tqId=1008889&ru=/exam/oj&qru=/ta/format-top101/question-ranking&sourceUrl=%2Fexam%2Foj
 * 最长无重复子数组
 */
public class BM092 {
    public static int maxLength (int[] arr) {
        int res = 0;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i : arr) {
            while (list.contains(i)){
                list.poll();
            }
            list.add(i);
            res = Math.max(res,list.size());
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        System.out.println(maxLength(arr));
    }
}