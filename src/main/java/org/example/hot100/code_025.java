package org.example.hot100;

import org.example.Hot150.ListNode;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/17 9:35 //创建时间
 * @Version: 1.0    //版本号
 * https://leetcode.cn/problems/reverse-nodes-in-k-group/?envType=study-plan-v2&envId=top-100-liked
 * K个一组翻转
 */
public class code_025 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return null;
        ListNode tail = head;
        for (int i = 0; i < k; i++) {
            if (tail == null) return head;
            tail = tail.next;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != tail){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        head.next = reverseKGroup(cur,k);
        return pre;
    }
}