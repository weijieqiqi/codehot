package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/22 11:04 //创建时间
 * @UpdateDate: 2024/3/22 11:04 //更新时间
 * @Version: 1.0    //版本号
 */
public class code_082 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode res = new ListNode(0);
        ListNode cur = res;
        cur.next = head;
        while (cur.next != null && cur.next.next != null){
            if (cur.next.val == cur.next.next.val){
                int temp = cur.next.val;
                while (cur.next != null && cur.next.val == temp){
                    cur.next = cur.next.next;
                }
            }else {
                cur = cur.next;
            }
        }
        return res.next;
    }
}