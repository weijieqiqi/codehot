package org.example.Hot150;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/14 9:52 //创建时间
 * @UpdateDate: 2024/3/14 9:52 //更新时间
 * @Version: 1.0    //版本号
 */
public class youString {

    public static int count(String str,char c){
        int count = 0;
        for (char c1 : str.toCharArray()) {
            if (c1 == c){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();//输出字符串
        int cut = Math.min(count(line,'y'),Math.min(count(line,'o'),count(line,'u')));

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : line.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        map.put('y',map.getOrDefault('y',0) - cut);
        map.put('o',map.getOrDefault('o',0) - cut);
        map.put('u',map.getOrDefault('u',0) - cut);

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < cut; i++) {
            stringBuffer.append("you");
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
            char key = characterIntegerEntry.getKey();
            int value = characterIntegerEntry.getValue();
            if (value > 0){
                for (int i = 0; i < value; i++) {
                    stringBuffer.append(key);
                }
            }
        }
        System.out.println(stringBuffer.toString());
    }

}