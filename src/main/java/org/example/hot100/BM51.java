package org.example.hot100;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/23 14:13 //创建时间
 * @Version: 1.0    //版本号
 * https://www.nowcoder.com/practice/e8a1b01a2df14cb2b228b30ee6a92163?tpId=295&tqId=23271&ru=/exam/oj&qru=/ta/format-top101/question-ranking&sourceUrl=%2Fexam%2Foj
 */
public class BM51 {
    public int MoreThanHalfNum_Solution(int[] numbers) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();//key为值，value为出现的次数
        // write code here
        for (int i = 0; i < numbers.length; i++) {
            if (hashMap.containsKey(numbers[i])) {
                hashMap.put(numbers[i], hashMap.get(numbers[i]) + 1);
            } else {
                hashMap.put(numbers[i], 1);
            }
        }

        Iterator<Integer> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (hashMap.get(next) > numbers.length / 2) {
                return next;
            }
        }
        return 0;
    }

}