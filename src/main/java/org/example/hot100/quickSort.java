package org.example.hot100;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/28 9:41 //创建时间
 * @Version: 1.0    //版本号
 * 快排
 */
public class quickSort {
    public static void quick(int[] a) {
        int n = a.length;
        process(a, 0, n - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

    public static void process(int[] arr, int L, int R) {
        if (L > R) return;
        int M = parttion(arr, L, R);
        process(arr, L, M - 1);
        process(arr, M + 1, R);
    }

    public static int parttion(int[] arr, int L, int R) {
        if (L > R) return -1;
        if (L == R) return L;
        int less = L - 1;
        int index = L;
        while (index < R) {
            if (arr[index] >= arr[R]) {
                swap(arr, index, ++less);
            }
            index++;
        }
        swap(arr, ++less, R);
        return less;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        quick(arr);
    }
}