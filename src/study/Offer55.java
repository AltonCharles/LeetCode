package study;

import javax.transaction.TransactionRequiredException;
import java.util.function.LongFunction;

/**
 * @author yanggq
 * @create 2022-04-10 20:34
 */
/*
* 输入一棵二叉树的根节点，求该树的深度。
* 从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，
* 最长路径的长度为树的深度。
* */
/*递归实现
* */
public class Offer55 {

    public int maxDepth(TreeNode root) {
        int h=1;
        if(root==null)
            return 0;
       return h+Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
//        node.left=new TreeNode(2);
//        node.right=new TreeNode(3);
//        node.left.left=new TreeNode(4);
        System.out.println(new Offer55().maxDepth(node));
    }
}
