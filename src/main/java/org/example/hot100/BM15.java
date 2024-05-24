package org.example.hot100;

import org.example.Hot150.ListNode;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/24 11:07 //创建时间
 * @Version: 1.0    //版本号
 */
public class BM15 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode listNode = deleteDuplicates(node);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}