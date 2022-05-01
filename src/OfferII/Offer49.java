package OfferII;

/**
 * @author yanggq
 * @create 2022-05-01 19:36
 */
/*
* 给定一个二叉树的根节点 root ，树中每个节点都存放有一个 0 到 9 之间的数字。
每条从根节点到叶节点的路径都代表一个数字：
例如，从根节点到叶节点的路径 1 -> 2 -> 3 表示数字 123 。
计算从根节点到叶节点生成的 所有数字之和 。
叶节点 是指没有子节点的节点。
* */
public class Offer49 {
    public int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }

    public int dfs(TreeNode now,int parentVal){
        if(now==null)
            return 0;
        if(now.left==null&&now.right==null)
            return parentVal*10+now.val;
        parentVal=parentVal*10+now.val;
        return dfs(now.left,parentVal)+dfs(now.right,parentVal);
    }
}
