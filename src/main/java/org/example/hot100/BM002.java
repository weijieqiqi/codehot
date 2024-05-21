package org.example.hot100;

import org.example.Hot150.ListNode;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/7 9:54 //创建时间
 * @Version: 1.0    //版本号
 * 指定区间翻转
 */
public class BM002 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // write code here
        if (head == null) return null;
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode pre = res;
        ListNode cur = head;
        for (int i = 1; i < m; i++) {
            pre = cur;
            cur = cur.next;
        }
        for (int i = m; i < n; i++) {
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = pre.next;
            pre.next = temp;
        }
        return res.next;
    }
}