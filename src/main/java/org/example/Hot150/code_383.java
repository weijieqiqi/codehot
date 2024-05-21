package org.example.Hot150;


/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/19 10:32 //创建时间
 * @UpdateDate: 2024/3/19 10:32 //更新时间
 * @Version: 1.0    //版本号
 */
public class code_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] record= new int[26];
        //遍历
        for (char c : magazine.toCharArray()) {
            record[c - 'a'] += 1;
        }
        for (char c : ransomNote.toCharArray()) {
            record[c - 'a'] -= 1;
            if (record[c - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}