package org.example.Hot150;

import java.util.Scanner;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/11 16:53 //创建时间
 * @UpdateDate: 2024/3/11 16:53 //更新时间
 * @Version: 1.0    //版本号
 */
public class XIaomeishuz {
    public static void xiaomei(int len, int query) {
        Scanner scanner = new Scanner(System.in);
        int N = 100010;
        int[] s = new int[N];//定一个数组
        int zeronum = 0;
        int sum = 0;
        int l = 0, r = 0;
        int maxvalue = 0, minvalue = 0;
        for (int i = 0; i < len; i++) {
            s[i] = scanner.nextInt();
            if (s[i] == 0) {
                zeronum++;
            }
            sum += s[i];
        }
        while (query > 0) {
            l = scanner.nextInt();
            r = scanner.nextInt();
            maxvalue = zeronum * l + sum;
            minvalue = zeronum * r + sum;
            System.out.println(maxvalue + " " + minvalue);
            query--;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int j = scanner.nextInt();
        xiaomei(t,j);
    }
}