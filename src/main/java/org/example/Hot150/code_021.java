package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/20 9:40 //创建时间
 * @UpdateDate: 2024/3/20 9:40 //更新时间
 * @Version: 1.0    //版本号
 * 合并两个有序链表
 * https://leetcode.cn/problems/merge-two-sorted-lists/?envType=study-plan-v2&envId=top-interview-150
 */
public class code_021 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        //加一个表头
        ListNode node = new ListNode(-1);
        ListNode cur = node;
        while (list1 != null && list2 != null){
            if (list1.val >= list2.val){
                cur.next = list2;
                list2 = list2.next;
            }else {
                cur.next = list1;
                list1 = list1.next;
            }
            cur = cur.next;
        }
        if (list1 != null){
            cur.next = list1;
        }else if (list2 != null){
            cur.next = list2;
        }
        return node.next;
    }
}