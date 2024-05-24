package org.example.hot100;

import org.example.Hot150.ListNode;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/24 11:17 //创建时间
 * @Version: 1.0    //版本号
 */
public class BM16 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode node = new ListNode(-1);
        ListNode cur = node;
        cur.next = head;
        int temp = 0;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                temp = cur.next.val;
                while (cur.next != null && cur.next.val == temp) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }
        return node.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode listNode = deleteDuplicates(node);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}