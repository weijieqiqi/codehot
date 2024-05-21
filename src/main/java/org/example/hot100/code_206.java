package org.example.hot100;

import org.example.Hot150.ListNode;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/16 10:07 //创建时间
 * @Version: 1.0    //版本号
 * https://leetcode.cn/problems/reverse-linked-list/submissions/523997088/?envType=study-plan-v2&envId=top-100-liked
 * 反转链表
 */
public class code_206 {
    public ListNode reverseList(ListNode head) {
        ListNode pro = null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur != null){
            temp = cur.next;
            cur.next = pro;
            pro = cur;
            cur = temp;
        }
        return pro;
    }
}