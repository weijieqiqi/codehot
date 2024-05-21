package org.example.hot100;

import org.example.Hot150.ListNode;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/7 10:03 //创建时间
 * @Version: 1.0    //版本号
 */
public class BM003 {
    public ListNode Merge(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null) return pHead2;
        if (pHead2 == null) return pHead1;
        ListNode res = new ListNode(-1);
        ListNode cur = res;
        while (pHead1 != null && pHead2 != null) {
            if (pHead1.val >= pHead2.val) {
                cur.next = pHead2;
                pHead2 = pHead2.next;
            } else {
                cur.next = pHead1;
                pHead1 = pHead1.next;
            }
            cur = cur.next;
        }
        if (pHead1 != null){
            cur.next = pHead1;
        }else {
            cur.next = pHead2;
        }
        return res.next;
    }
}