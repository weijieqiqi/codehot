package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/19 10:42 //创建时间
 * @UpdateDate: 2024/3/19 10:42 //更新时间
 * @Version: 1.0    //版本号
 */
public class code141 {

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }
}