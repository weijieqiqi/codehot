package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/22 9:50 //创建时间
 * @UpdateDate: 2024/3/22 9:50 //更新时间
 * @Version: 1.0    //版本号
 */
public class code_092 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode res = new ListNode(-1);
        res.next = head;
        
        ListNode pre = res;
        ListNode cur = head;
        for (int i = 1; i < left; i++) {
            pre = cur;
            cur = cur.next;
        }

        for (int i = left; i < right; i++) {
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = pre.next;
            pre.next = temp;
        }
        return res.next;
    }
}