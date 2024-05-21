package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/25 9:42 //创建时间
 * @Version: 1.0    //版本号
 */
public class code_061 {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode dump = new ListNode(-1);
        dump.next = revere(head);//翻转了
        int size = 0;
        ListNode cur = dump.next;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        if (size <=1) return head;
        k = k % size;
        ListNode pre = dump,end = dump;
        for (int i = 0; i < k; i++) {
            end = end.next;
        }
        ListNode start = pre.next, next = end.next;
        if (start == next) return revere(start);
        end.next = null;
        pre.next = revere(start);
        start.next = revere(next);
        return dump.next;
    }

    public ListNode revere(ListNode head) {
        if (head == null) return null;
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}