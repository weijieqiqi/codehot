package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/11 14:25 //创建时间
 * @UpdateDate: 2024/3/11 14:25 //更新时间
 * @Version: 1.0    //版本号
 * <p>
 * 0到n中包含2的数字个数
 * <p>
 * 给定一个正整数n，其取值范围为(0,999999]，计算出[0,n]之间包含2的数字出现的次数。
 * <p>
 * 如果当前位<2，则此时2的个数为高位*flag
 * <p>
 * 如果当前位=2，则此时2的个数为高位*flag+低位+1【0到低位共低位+1个数】
 * <p>
 * 如果当前位>2，则此时2的个数为(高位+1)*flag
 */
public class numberOf2sInRange {
    // 计算在给定范围内数字2的出现次数
    public static int numberOf2sInRange(int n) {
        // 初始化乘数、计数器和余数
        int multiplier = 1; // 用于区分数字的位置
        int count = 0; // 用于计数数字2的出现次数
        int remainder = n; // 保存剩余的数字部分
        // 循环直到余数为0
        while (remainder != 0) {
            // 获取当前位置的数字
            int digit = remainder % 10;
            // 计算当前位置左边的数字（包括当前位置）
            int left = n / (multiplier * 10);
            // 计算当前位置右边的数字
            int right = n % multiplier;
            // 根据当前位置的数字进行计数
            if (digit > 2) {
                count += (left + 1) * multiplier;
            } else if (digit == 2) {
                count += left * multiplier + right + 1;
            } else {
                count += left * multiplier;
            }
            // 更新乘数和余数，以处理下一个数字位置
            multiplier *= 10;
            remainder /= 10;
        }
        // 返回计数器中数字2的总数
        return count;
    }

    public static int numberOf2sInRange2(int n) {
        int flag = 1;//记录当前的数字位
        int count = 0;
        int remainder = n;//当前的数
        while (remainder != 0) {
            int cur = remainder % 10;//当前位
            int hight = n / (flag * 10);//高位
            int low = n % flag;//地位
            if (cur > 2) {
                count += (hight + 1) * flag;
            } else if (cur == 2) {
                count += hight * flag + low + 1;
            } else {
                count += hight * flag;
            }
            flag = flag * 10;
            remainder = remainder/10;
        }
        return count;
    }


    public static void main(String[] args) {
        int result = numberOf2sInRange2(211); // Example call
        System.out.println(result);
    }
}