package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/7 10:28 //创建时间
 * @Version: 1.0    //版本号
 */
public class code_066 {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] == 9){
                digits[i] = 0;
            }else {
                digits[i] += 1;
                return digits;
            }
        }
        digits = new int[len+1];
        digits[0] = 1;
        return digits;
    }
}