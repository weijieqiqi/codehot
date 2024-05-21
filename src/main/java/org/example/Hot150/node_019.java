package org.example.Hot150;


/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/22 10:10 //创建时间
 * @UpdateDate: 2024/3/22 10:10 //更新时间
 * @Version: 1.0    //版本号
 */
public class node_019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode fast = node;
        ListNode slow = node;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return node.next;
    }


}