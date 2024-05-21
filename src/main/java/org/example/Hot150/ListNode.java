package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/19 10:44 //创建时间
 * @UpdateDate: 2024/3/19 10:44 //更新时间
 * @Version: 1.0    //版本号
 */
public class ListNode {
    public int val;

    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}