package org.example.hot100;

import org.example.Hot150.ListNode;

import java.util.Stack;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/16 10:13 //创建时间
 * @Version: 1.0    //版本号
 */
public class code_234 {
    public static boolean isPalindrome(ListNode head) {
        ListNode original = new ListNode(-1);
        ListNode temp2 = original;
        ListNode cur = head;
        while (cur != null) {
            temp2.next = new ListNode(cur.val); // 复制节点
            temp2 = temp2.next;
            cur = cur.next;
        }

        ListNode reversed = reverseList(head);
        while (original.next != null && reversed != null) {
            if (original.next.val != reversed.val) {
                return false;
            }
            original = original.next;
            reversed = reversed.next;
        }
        return true;
    }

    public static boolean isPalindrome2(ListNode head) {
        Stack<Integer> integers = new Stack<>();
        ListNode temp = head;
        while (head != null){
            integers.push(head.val);
            head = head.next;
        }
        while (!integers.isEmpty()){
            if (integers.pop() != temp.val){
                return false;
            }
            temp = temp.next;
        }
        return true;

    }



    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        ListNode listNode = new ListNode(1,new ListNode(1,new ListNode(3,new ListNode(1))));
        System.out.println(isPalindrome(listNode1));
        System.out.println(isPalindrome2(listNode));
    }
}