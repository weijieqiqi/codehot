package org.example.hot100;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/23 11:26 //创建时间
 * @Version: 1.0    //版本号
 */
public class BM47 {
    public int findKth(int[] a, int n, int K) {
        // write code here
        process(a, 0, n - 1);
        return a[K - 1];
    }

    public void process(int[] a, int L, int R) {
        if (L > R) {
            return;
        }
        int m = pattion(a, L, R);
        process(a, L, m - 1);
        process(a, m + 1, R);
    }

    public int pattion(int[] a, int L, int R) {
        if (L > R) return -1;
        if (L == R) return L;
        int less = L - 1;
        int index = L;
        while (index < R) {
            if (a[index] >= a[R]) {
                swap(a, ++less, index);
            }
            index++;
        }
        swap(a, ++less, R);
        return less;
    }

    public void swap(int[] a, int L, int R) {
        int temp = a[L];
        a[L] = a[R];
        a[R] = temp;
    }



}