package org.example.hot100;

import java.util.ArrayList;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/22 10:17 //创建时间
 * @Version: 1.0    //版本号
 */
public class BM60 {

    ArrayList<String> ans = new ArrayList<>();

    public ArrayList<String> generateParenthesis(int n) {
        if (n < 1) return ans;
        dfs(new StringBuilder(), n, n);
        return ans;
    }

    public void dfs(StringBuilder sb, int left, int right) {
        if (left == 0 && right == 0) {
            ans.add(sb.toString());
            return;
        }

        if (left > 0) {
            sb.append("(");
            dfs(sb, left - 1, right);
            sb.delete(sb.length() - 1, sb.length());
        }


        if (right > 0 && right > left) {
            sb.append(")");
            dfs(sb, left, right - 1);
            sb.delete(sb.length() - 1, sb.length());
        }

    }
}