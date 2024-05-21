package org.example.Hot150;

/**
 * @Author: WeiJyx
 * @CreateDate: 2024/3/29 9:30 //创建时间
 * @Version: 1.0    //版本号
 * 二叉树的镜像
 * https://www.nowcoder.com/practice/a9d0ecbacef9410ca97463e4a5c83be7?tpId=295&tqId=1374963&ru=
 * /exam/company&qru=/ta/format-top101/question-ranking&sourceUrl=%2Fexam%2Fcompany
 */
public class BM_33 {
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if(pRoot == null) return null;
        TreeNode temp = pRoot.left;
        pRoot.left = pRoot.right;
        pRoot.right = temp;
        Mirror(pRoot.left);
        Mirror(pRoot.right);
        return pRoot;
    }
}