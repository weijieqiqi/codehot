package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/20 9:16 //创建时间
 * @UpdateDate: 2024/3/20 9:16 //更新时间
 * @Version: 1.0    //版本号
 * 两数相加
 * https://leetcode.cn/problems/add-two-numbers/?envType=study-plan-v2&envId=top-interview-150
 */
public class code02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode tail = listNode;
        int temp = 0;//存当前需要填的值
        int temp2 = 0;//存储进位
        int cur = 0;
        while (l1 != null && l2 != null) {
            cur = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + temp2;
            temp = cur % 10;
            temp2 = cur / 10;
            ListNode node = new ListNode(temp);
            tail.next = node;
            tail = node;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if (temp2 == 1) {
            //还有一位
            ListNode node = new ListNode(temp2);
            tail.next = node;
            tail = node;
        }
        return listNode.next;
    }
}