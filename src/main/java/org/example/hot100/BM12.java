package org.example.hot100;

import org.example.Hot150.ListNode;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/15 9:28 //创建时间
 * @Version: 1.0    //版本号
 */
public class BM12 {
    public static ListNode sortInList(ListNode head) {
        ArrayList<Integer> listNodes = new ArrayList<>();
        while (head != null) {
            listNodes.add(head.val);
            head = head.next;
        }
        int[] array = new int[listNodes.size()];
        for (int i = 0; i < listNodes.size(); i++) {
            array[i] = listNodes.get(i);
        }
        quicksort(array);

        ListNode dummy = new ListNode(0); // 哨兵节点
        ListNode current = dummy;
        for (int val : array) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next; // 返回排序后的链表
    }


    public static void quicksort(int[] arr) {
        if (arr.length == 0) return;
        process(arr, 0, arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void process(int[] arr, int L, int R) {
        if (L > R) return;
        int M = pattion(arr, L, R);
        process(arr, L, M - 1);
        process(arr, M + 1, R);
    }

    public static int pattion(int[] arr, int L, int R) {
        if (L > R) return -1;
        if (L == R) return L;
        int index = L;
        int less = L - 1;
        while (index < R) {
            if (arr[index] <= arr[R]){
                swap(arr,++less,index);
            }
            index++;
        }
        swap(arr,++less,R);
        return less;
    }

    public static void swap(int[] arr, int L, int R) {
        int temp = arr[L];
        arr[L] = arr[R];
        arr[R] = temp;
    }

    public ListNode sortInList1(ListNode head) {
        if (head == null) {
            return null;
        }
        ArrayList<ListNode> listNodes = new ArrayList<>();
        while (head != null) {
            listNodes.add(head);
            head = head.next;
        }

        listNodes.sort(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        ListNode listNode = new ListNode(-1);
        ListNode temp = listNode;
        for (int j = 0; j < listNodes.size(); j++) {
            ListNode temp2 = new ListNode(listNodes.get(j).val);
            temp.next = temp2;
            temp = temp.next;
        }
        return listNode.next;
    }

    public static void main(String[] args) {
        ListNode temp = new ListNode(1, new ListNode(3, new ListNode(2, new ListNode(4, new ListNode(5)))));
        ListNode node = sortInList(temp);
    }
}