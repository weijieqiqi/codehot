package org.example.hot100;

import org.example.Hot150.ListNode;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/7 9:37 //创建时间
 * @Version: 1.0   反转链表
 */
public class BM001 {
    public static ListNode ReverseList(ListNode head) {
        // write code here
        if (head == null) return null;
        ListNode pre = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode temp = new ListNode(1,new ListNode(2,new ListNode(3)));
        ListNode node = ReverseList(temp);
        while (node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }

}