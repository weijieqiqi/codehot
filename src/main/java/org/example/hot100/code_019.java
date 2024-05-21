package org.example.hot100;

import org.example.Hot150.ListNode;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/16 14:31 //创建时间
 * @Version: 1.0    //版本号
 */
public class code_019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode listNode = new ListNode(-1);
        listNode.next = head;
        ListNode fast = listNode;
        ListNode slow = listNode;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return listNode.next;
    }
}