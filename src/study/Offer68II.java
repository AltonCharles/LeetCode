package study;

/**
 * @author yanggq
 * @create 2022-04-25 15:19
 */
/*
* 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。*/
public class Offer68II {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root==p||root==q)
            return root;
        TreeNode left=lowestCommonAncestor(root.left, p, q);
        TreeNode right=lowestCommonAncestor(root.right, p, q);
        if(left==null&&right==null)
            return null;
        if(left==null&&right!=null)
            return right;
        if (left!=null&&right==null)
            return left;
        return root;
    }
}
