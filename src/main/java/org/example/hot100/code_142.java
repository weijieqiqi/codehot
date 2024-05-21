package org.example.hot100;

import org.example.Hot150.ListNode;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/16 14:22 //创建时间
 * @Version: 1.0    //版本号
 * https://leetcode.cn/problems/linked-list-cycle-ii/submissions/381570245/?envType=study-plan-v2&envId=top-100-liked
 * 环形链表2
 */
public class code_142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                ListNode temp = head;
                ListNode temp2 = slow;
                while (temp != temp2){
                    temp = temp.next;
                    temp2 = temp2.next;
                }
                return temp;
            }
        }
        return null;
    }
}