package org.example.Hot150;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/18 10:20 //创建时间
 * @UpdateDate: 2024/3/18 10:20 //更新时间
 * @Version: 1.0    //版本号
 */
public class windows_size {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        if (num == null || size < 1 || num.length < size) {
            return res;
        }

        for (int i = 0; i < num.length; i++) {
            while (!list.isEmpty() && num[list.peekLast()] <= num[i]) {
                list.pollLast();
            }
            list.addLast(i);

            if (list.peekFirst() == i - size) {
                list.pollFirst();
            }

            if (i >= size - 1) {
                res.add(num[list.peekFirst()]);
            }
        }
        return res;
    }
}