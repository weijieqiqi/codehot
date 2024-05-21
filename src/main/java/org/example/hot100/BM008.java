package org.example.hot100;

import org.example.Hot150.ListNode;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/14 9:36 //创建时间
 * @Version: 1.0    //版本号
 * https://www.nowcoder.com/practice/886370fe658f41b498d40fb34ae76ff9?tpId=295&tqId=1377477&ru=/exam/company&qru=/ta/format-top101/question-ranking&sourceUrl=%2Fexam%2Fcompany
 * 倒数第K个结点
 */
public class BM008 {
    public static ListNode FindKthToTail(ListNode pHead, int k) {
        // write code here
        if (pHead == null || k == 0) return null;
        ListNode fast = pHead;
        ListNode slow = pHead;
        for (int i = 0; i < k; i++) {
            if (fast == null) return null;
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode temp = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode node = FindKthToTail(temp, 2);
        System.out.println(node.val);
    }
}