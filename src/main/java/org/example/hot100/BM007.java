package org.example.hot100;

import org.example.Hot150.ListNode;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/8 9:30 //创建时间
 * @Version: 1.0    //版本号
 */
public class BM007 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) return null;
        ListNode fast = pHead;
        ListNode slow = pHead;
        ListNode temp = pHead;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow.val == fast.val){
                while (temp.val != fast.val){
                    temp = temp.next;
                    fast = fast.next;
                }
                return temp;
            }
        }
        return null;
    }
}