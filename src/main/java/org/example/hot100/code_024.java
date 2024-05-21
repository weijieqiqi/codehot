package org.example.hot100;

import org.example.Hot150.ListNode;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/16 14:55 //创建时间
 * @Version: 1.0    //版本号
 * https://leetcode.cn/problems/swap-nodes-in-pairs/?envType=study-plan-v2&envId=top-100-liked
 * 两两交换链表中的节点
 */
public class code_024 {
    public ListNode swapPairs(ListNode head) {
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode prve = node;
        while (prve.next != null && prve.next.next != null) {
            ListNode temp = head.next.next;
            prve.next = head.next;
            head.next.next = head;
            head.next = temp;
            prve = head;
            head = head.next;
        }
        return node.next;
    }
}