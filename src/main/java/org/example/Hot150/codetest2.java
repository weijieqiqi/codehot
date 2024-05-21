package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/14 14:03 //创建时间
 * @UpdateDate: 2024/3/14 14:03 //更新时间
 * @Version: 1.0    //版本号
 */
public class codetest2 {
    // 先手
    // L==R return arr[L]
    // Max(arr[L] + g[arr,L+1,R),arr[R] + g[arr,L,R-1))
    // 后手
    // L == R return 0；

    public static int win1(int[] arr) {
        int first = f(arr, 0, arr.length - 1);
        int second = g(arr, 0, arr.length - 1);
        return Math.max(first, second);
    }

    //先后
    public static int f(int[] arr, int L, int R) {
        if (L == R) {
            return arr[L];
        }
        int p1 = arr[L] + g(arr, L + 1, R);
        int p2 = arr[R] + g(arr, L, R - 1);
        return Math.max(p1, p2);
    }

    public static int g(int[] arr, int L, int R) {
        if (L == R) {
            return 0;
        }
        //f的含义就是挑最好
        //对手挑选了左边第一个，我在剩下的全力以赴
        int p1 = f(arr, L + 1, R);
        //对手挑选了右边第一个，我在剩下的全力以赴
        int p2 = f(arr, L, R - 1);
        return Math.min(p1, p2);
    }


    public static int win2(int[] arr) {
        int N = arr.length;
        int[][] fmap = new int[N][N];
        int[][] gmap = new int[N][N];
        int first = f1(arr, 0, arr.length - 1, fmap, gmap);
        int second = g1(arr, 0, arr.length - 1, fmap, gmap);
        return Math.max(first, second);
    }

    //先后
    public static int f1(int[] arr, int L, int R, int[][] fmap, int[][] gmap) {
        if (fmap[L][R] != 0) {
            return fmap[L][R];
        }
        int ans = 0;
        if (L == R) {
            ans = arr[L];
        } else {
            int p1 = arr[L] + g1(arr, L + 1, R, fmap, gmap);
            int p2 = arr[R] + g1(arr, L, R - 1, fmap, gmap);
            ans = Math.max(p1, p2);
        }
        fmap[L][R] = ans;
        return ans;
    }

    public static int g1(int[] arr, int L, int R, int[][] fmap, int[][] gmap) {
        if (gmap[L][R] != 0) {
            return gmap[L][R];
        }
        int ans = 0;
        if (L != R) {
            //f的含义就是挑最好
            //对手挑选了左边第一个，我在剩下的全力以赴
            int p1 = f1(arr, L + 1, R, fmap, gmap);
            //对手挑选了右边第一个，我在剩下的全力以赴
            int p2 = f1(arr, L, R - 1, fmap, gmap);
            ans = Math.min(p1, p2);
        }
        gmap[L][R] = ans;
        return ans;
    }

    public static int win3(int[] arr) {
        int N = arr.length;
        int[][] fmap = new int[N][N];
        int[][] gmap = new int[N][N];
        for (int i = 0; i < N; i++) {
            fmap[i][i] = arr[i];
        }
        for (int startCol = 1; startCol < N; startCol++) {
            int L = 0;//行
            int R = startCol;//列
            while (R < N) {
                fmap[L][R] = Math.max((arr[L] + gmap[L + 1][R]), (arr[R] + gmap[L][R - 1]));
                gmap[L][R] = Math.min(fmap[L + 1][R], fmap[L][R - 1]);
                L++;
                R++;
            }
        }
        return Math.max(fmap[0][N - 1], gmap[0][N - 1]);
    }

    public static void main(String[] args) {
        System.out.println(win1(new int[]{5, 7, 4, 5, 8, 1, 6, 0, 3, 4, 6, 1, 7}));
        System.out.println(win2(new int[]{5, 7, 4, 5, 8, 1, 6, 0, 3, 4, 6, 1, 7}));
        System.out.println(win3(new int[]{5, 7, 4, 5, 8, 1, 6, 0, 3, 4, 6, 1, 7}));
    }
}