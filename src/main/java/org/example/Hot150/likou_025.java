package org.example.Hot150;

import java.lang.reflect.Constructor;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/21 15:40 //创建时间
 * @UpdateDate: 2024/3/21 15:40 //更新时间
 * @Version: 1.0    //版本号
 */
public class likou_025 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode tail = head;
        for (int i = 0; i < k; i++) {
            if (tail == null) return head;
            tail = tail.next;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != tail) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        head.next = reverseKGroup(cur,k);
        return pre;
    }

    public static void main(String[] args) {
        try {
            Constructor<?> constructor = HungrySingleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            Object instance1 = constructor.newInstance();
            System.out.println("通过反射创建的实例1：" + instance1);
            Object instance2 = constructor.newInstance();
            System.out.println("通过反射创建的实例2：" + instance2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}