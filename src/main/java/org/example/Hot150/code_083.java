package org.example.Hot150;
/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/22 11:10 //创建时间
 * @UpdateDate: 2024/3/22 11:10 //更新时间
 * @Version: 1.0    //版本号
 */
public class code_083 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode cur = head;
        while (cur != null && cur.next != null){
            if (cur.val == cur.next.val){
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return head;
    }
}